
import java.util.List;
import java.awt.*;
import static java.util.Collections.list;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class FriendPattern extends javax.swing.JFrame {
private FriendService friendService = new FriendService();
    private String currentUserId = "123"; 
    public FriendPattern() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        acceptB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        declineB = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        refershRequstB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        refershB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        friendLIstRefreshB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        acceptB.setBackground(new java.awt.Color(0, 204, 102));
        acceptB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        acceptB.setText("ACCEPT");
        acceptB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(acceptB);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        declineB.setBackground(new java.awt.Color(255, 0, 0));
        declineB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        declineB.setText("DECLINE");
        declineB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBActionPerformed(evt);
            }
        });
        jScrollPane4.setViewportView(declineB);

        refershRequstB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refershRequstB.setText("Refersh");
        refershRequstB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refershRequstBActionPerformed(evt);
            }
        });
        jScrollPane5.setViewportView(refershRequstB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 229, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane4, jScrollPane5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane4, jScrollPane5});

        jTabbedPane1.addTab("FriendRequest", jPanel1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        refershB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refershB.setText("REFERSH");
        refershB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refershBActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refershB)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refershB)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Friend Suggestion", jPanel2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList3);

        friendLIstRefreshB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        friendLIstRefreshB.setText("REFRESH");
        friendLIstRefreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendLIstRefreshBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(friendLIstRefreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(friendLIstRefreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Friend List", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBActionPerformed
accept();
    }//GEN-LAST:event_acceptBActionPerformed

    private void declineBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBActionPerformed
decline();    }//GEN-LAST:event_declineBActionPerformed

    private void refershRequstBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refershRequstBActionPerformed
refreshRequestsList();       
    }//GEN-LAST:event_refershRequstBActionPerformed

    private void refershBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refershBActionPerformed
        refreshSuggestionsList();     
    }//GEN-LAST:event_refershBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
add();    }//GEN-LAST:event_jButton1ActionPerformed

    private void friendLIstRefreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendLIstRefreshBActionPerformed
refreshFriendList();    }//GEN-LAST:event_friendLIstRefreshBActionPerformed

   private void refreshFriendList() {
    try {
        // Retrieve all friendships from storage
        List<Friend> friendships = Database.readFromFile("friends.json", Friend[].class);

        // Filter friendships for the current user
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Friend friendship : friendships) {
            if (friendship.getUser1Id().equals(currentUserId)) {
                model.addElement("Friend: " + friendship.getUser2Id());
            } else if (friendship.getUser2Id().equals(currentUserId)) {
                model.addElement("Friend: " + friendship.getUser1Id());
            }
        }

        // Set the filtered friends list to jList
        jList3.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Failed to load friends: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
  private void refreshRequestsList() {
      try{  List<FriendRequest> requests = Database.readFromFile("friend_requests.json", FriendRequest[].class);
        DefaultListModel<String> model = new DefaultListModel<>();
        for (FriendRequest req : requests) {
            if (req.getToUserId().equals(currentUserId)) {
                model.addElement(req.getFromUserId() + ": Pending");
            }
        }
        jList1.setModel(model);
    }
   catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Failed to load friend requests: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }}

private void accept(){
    String selectedRequest = jList1.getSelectedValue();
    if (selectedRequest != null) {
        friendService.manageFriendRequest(selectedRequest, currentUserId, true);

        // Save the friendship
        try {
            String[] parts = selectedRequest.split(":");
            String fromUserId = parts[0].trim();

            List<Friend> friends = Database.readFromFile("friendships.json", Friend[].class);
           
            friends.add(new Friend (fromUserId,currentUserId));
            friends.add(new Friend (currentUserId,fromUserId));
            

            
            Database.writeToFile("friendships.json", friends);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to add to friend list: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        refreshRequestsList();
        refreshFriendList(); // Update the friend list
    } else {
        JOptionPane.showMessageDialog(this, "Please select a request first.");
    }
}
private void decline(){
        String selectedRequest = jList1.getSelectedValue();
        if (selectedRequest != null) {
            friendService.manageFriendRequest(selectedRequest, currentUserId, false);
            refreshRequestsList();
        }
        if (selectedRequest == null) {
    JOptionPane.showMessageDialog(this, "Please select a request first.");
    return;
}
    }
    private void refreshSuggestionsList() {
        List<User> suggestions = friendService.suggestFriends(currentUserId);
        DefaultListModel<String> model = new DefaultListModel<>();
        for (User user : suggestions) {
            model.addElement(user.getUserId() + ": " + user.getEmail());
        }
        jList2.setModel(model);
    }
    private void add(){
        String selectedSuggestion = jList2.getSelectedValue();
        if (selectedSuggestion != null) {
            friendService.sendFriendRequest(currentUserId, selectedSuggestion);
            refreshSuggestionsList();
        }
        if (selectedSuggestion == null) {
    JOptionPane.showMessageDialog(this, "Please select a request first.");
    return;
}
    }
            public static void main(String args[]) {
         {
        java.awt.EventQueue.invokeLater(() -> new FriendPattern().setVisible(true));
    }
            }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptB;
    private javax.swing.JButton declineB;
    private javax.swing.JButton friendLIstRefreshB;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton refershB;
    private javax.swing.JButton refershRequstB;
    // End of variables declaration//GEN-END:variables
}
