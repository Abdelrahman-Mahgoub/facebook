
public class FriendRequest {
    private String fromUserId;
    private String toUserId; 
    private String status; 

    public FriendRequest(String fromUserId, String toUserId, String status) {
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.status = status;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public String getStatus() {
        return status;
    }
    
}
