
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;


public  class FriendService {
    private static final String FRIENDS_FILE="friends.json";
    private static final String FRIENDS_REQUESTS_FILE="friends_requests.json";

public boolean sendFriendRequest(String fromUserId,String toUserId ){
List<FriendRequest> requests=Database.readFromFile(FRIENDS_REQUESTS_FILE,FriendRequest[].class);
requests.add(new FriendRequest(fromUserId , toUserId, "pending"));
Database.writeToFile(FRIENDS_REQUESTS_FILE,requests);
        return true;

}
 public boolean manageFriendRequest(String fromUserId, String toUserId, boolean accept) {
        List<FriendRequest> requests = Database.readFromFile(FRIENDS_REQUESTS_FILE, FriendRequest[].class);
        FriendRequest targetRequest = requests.stream()
                .filter(req -> req.getFromUserId().equals(fromUserId) && req.getToUserId().equals(toUserId))
                .findFirst().orElse(null);

        if (targetRequest != null) {
            requests.remove(targetRequest);
            if (accept) {
                List<Friend> friends = Database.readFromFile(FRIENDS_FILE, Friend[].class);
                friends.add(new Friend(fromUserId, toUserId));
                friends.add(new Friend(toUserId, fromUserId));
                Database.writeToFile(FRIENDS_FILE, friends);
            }
            Database.writeToFile(FRIENDS_REQUESTS_FILE, requests);
            return true;
        }
        return false;
    }

    // Block a friend
    public boolean blockFriend(String userId, String friendId) {
        List<Friend> friends = Database.readFromFile(FRIENDS_FILE, Friend[].class);
        friends.removeIf(f -> f.getUserId().equals(userId) && f.getFriendId().equals(friendId));
        Database.writeToFile(FRIENDS_FILE, friends);
        return true;
    }

    // Suggest friends
    public List<User> suggestFriends(String userId) {
        List<User> users = Database.readFromFile("users.json", User[].class);
        List<Friend> friends = Database.readFromFile(FRIENDS_FILE, Friend[].class);

        List<String> currentFriends = new ArrayList<>();
        for (Friend f : friends) {
            if (f.getUserId().equals(userId)) {
                currentFriends.add(f.getFriendId());
            }
        }

        List<User> suggestions = new ArrayList<>();
        for (User user : users) {
            if (!currentFriends.contains(user.getUserId()) && !user.getUserId().equals(userId)) {
                suggestions.add(user);
            }
        }

        return suggestions;
    }

   

   }
