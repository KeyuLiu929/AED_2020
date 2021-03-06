/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    
    // find user with Most Likes
    public void userWithMostLikes() {
       Map<Integer, Integer> userLikesCount = new HashMap<>();
       Map<Integer, User> users = DataStore.getInstance().getUsers();
       
       for(User user : users.values()){
           for(Comment c : user.getComments()){
               int likes = 0;
               if(userLikesCount.containsKey(user.getId())){
                   likes = userLikesCount.get(user.getId());
               }
               likes += c.getLikes();
               userLikesCount.put(user.getId(), likes);
               
           }
       }
       int max = 0;
       int maxId = 0;
       for(int id : userLikesCount.keySet()){
           if(userLikesCount.get(id) > max){
               max = userLikesCount.get(id);
               maxId = id;
           }
       }
       
       System.out.println("User with most likes: " + max + "\n"
            + users.get(maxId));
               
    }

    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>(){
            @Override
            public int compare(Comment o1, Comment o2){
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println();
        for(int i = 0;i < commentList.size() && i < 5;i++){
            System.out.println(commentList.get(i));
        }
        
    }
    
    //Task1
    //Find Average number of likes per comment
    public void findAverageNumOfLikesPerComment(){
        
    }
    
    //Task2
    //Find the post with most liked comments.
    public void findPostWithMostLikedComments(){
        
    }
    

    
    //Task3
    //Find the post with most comments
    public void findPostWithMostComments(){
        
    }
    
    //Task4
    //Top 5 inactive users based on total posts number
    public void topFiveInactiveUsersByTotalPostsNum(){
        
    }
    
    //Task5
    //Top 5 inactive users based on total comments they created
    public void topFiveInactiveUsersByTotalComments(){
        
    }
    
    //Task6
    //Top 5 inactive users overall (sum of comments, posts and likes)
    public void topFiveInactiveUsersByOverall(){
    Map<Integer, User> user = DataStore.getInstance().getUsers();
    List<User> userList = new ArrayList<>(user.values());
        
        Collections.sort(userList, new Comparator<User>(){
            @Override
            public int compare(User o1, User o2){
                return  o1.getOverallValues()- o2.getOverallValues();
            }
        });
        
        System.out.println();
        for(int i = 0;i < userList.size() && i < 5;i++){
            System.out.println(userList.get(i));
        }
        
    }
    
    //Task7
    //Top 5 proactive users overall (sum of comments, posts and likes)
    public void topFiveProactiveUsersByOverall(){
    Map<Integer, User> user = DataStore.getInstance().getUsers();
    List<User> userList = new ArrayList<>(user.values());
        
        Collections.sort(userList, new Comparator<User>(){
            @Override
            public int compare(User o1, User o2){
                return  o2.getOverallValues()- o1.getOverallValues() ;
            }
        });
        
        System.out.println();
        for(int i = 0;i < userList.size() && i < 5;i++){
            System.out.println(userList.get(i));
           
        }
         
        
    }
    
}
