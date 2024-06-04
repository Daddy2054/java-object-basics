package w3.classes;

import javax.swing.*;
import java.awt.*;
import java.util.*;

//add class definitions below this line

class Post {
  String username;
  int userId;
  String media;
  String avatar;
  String commentButton;
  int likes;
  String caption;
  ArrayList<String> comments;
  String likeButton;

  Post(String un, int ui, String m,
      String a, String cb, int l,
      String ca, ArrayList<String> co,
      String lb) {
    username = un;
    userId = ui;
    media = m;
    avatar = a;
    commentButton = cb;
    caption = ca;
    likes = l;
    comments = co;
    likeButton = lb;
  }
}

// add class definitions above this line
public class Photogram {
  public static void main(String[] args) {

    // add code below this line
    String username = "Sally_17";
    int userId = 112010;
    String media = "w3/classes/studentFolder/photogram/waterfall.png";
    String avatar = "w3/classes/studentFolder/photogram/avatarIcon.png";
    String commentButton = "w3/classes/studentFolder/photogram/addComment.png";
    String caption = "First time at Yosemite. It has surpassed all of my expectations.";
    int likes = 23;
    ArrayList<String> comments = new ArrayList<String>();
    comments.add("Beautiful!");
    comments.add("I wish I was there too.");
    comments.add("Is that Nevada Falls?");
    comments.add("Love it!");
    comments.add("Can't wait for the Halfdome pictures");
    comments.add("More pics please");
    String likeButton = "w3/classes/studentFolder/photogram/likesIcon.png";

    Post post1 = new Post(username, userId, media, avatar,
        commentButton, likes, caption,
        comments, likeButton);

    // System.out.println(post1.username);
    // System.out.println(post1.userId);
    // System.out.println(post1.media);
    // System.out.println(post1.avatar);
    // System.out.println(post1.commentButton);
    // System.out.println(post1.caption);
    // System.out.println(post1.likes);
    // System.out.println(post1.comments);
    // System.out.println(post1.likeButton);

    // create window
    JFrame window = new JFrame("Photogram");
    window.setSize(800, 500);
    window.setLayout(new FlowLayout(3));

    // create panels
    JPanel imagePanel = new JPanel();
    JPanel infoPanel = new JPanel(new GridLayout(comments.size() + 7, 1));
    JPanel userPanel = new JPanel(new FlowLayout(3, 0, 5));
    JPanel likesPanel = new JPanel(new FlowLayout(3, 0, 5));

    // create fonts
    Font boldFont = new Font("SansSerif", Font.BOLD, 14);
    Font plainFont = new Font("SansSerif", Font.PLAIN, 14);

    // create waterfall image
    ImageIcon image = new ImageIcon(post1.media);
    JLabel imageLabel = new JLabel(image);
    imagePanel.add(imageLabel);

    // create avatar image
    ImageIcon avatarImage = new ImageIcon(post1.avatar);
    JLabel avatarIcon = new JLabel(avatarImage, JLabel.LEFT);
    userPanel.add(avatarIcon);

    // create username text
    JLabel usernameLabel = new JLabel(post1.username, JLabel.LEFT);
    usernameLabel.setFont(boldFont);
    userPanel.add(usernameLabel);
    infoPanel.add(userPanel);
    // create caption text
    String txt = post1.caption;
    String html = "<html><body style='width: %1spx'>%1s";
    JLabel captionLabel = new JLabel(String.format(html, 200, txt), JLabel.LEFT);
    captionLabel.setFont(plainFont);
    infoPanel.add(captionLabel);

    // create "+" image
    ImageIcon commentButtonImage = new ImageIcon(post1.commentButton);
    JLabel commentButtonLabel = new JLabel(commentButtonImage);
    infoPanel.add(commentButtonLabel);
    // create user comments
    for (String comment : post1.comments) {
      JLabel commentLabel = new JLabel(comment, JLabel.LEFT);
      commentLabel.setFont(plainFont);
      infoPanel.add(commentLabel);
    }
    // create heart image
    ImageIcon likesImage = new ImageIcon(post1.likeButton);
    JLabel likesIconLabel = new JLabel(likesImage, JLabel.LEFT);
    likesPanel.add(likesIconLabel);

    // create number of likes
    JLabel likesCountLabel = new JLabel(String.valueOf(post1.likes), JLabel.LEFT);
    likesCountLabel.setFont(plainFont);
    likesPanel.add(likesCountLabel);
    infoPanel.add(likesPanel);

    // add panels to window
    window.add(imagePanel);
    // window.add(userPanel);
    window.add(infoPanel);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    // add code above this line
  }
}