package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

// NOTE: message_id shouldn't be inserted
//{
//        "user_id":1,
//        "passage":"Philippians 1:1-6",
//        "key_phrase":"I thank my God in all my remembrance of you",
//        "title":"Remembering People In My Prayers",
//        "url":"http://gracepoint-devotions-berkeley.org",
//        "speaker":"Pastor Ed",
//        "date":"doesn't matter"
//}

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long message_id;
    public Long user_id;
    public String key_phrase;
    public String title;
    public String url;
    public String speaker;
    public String date;
    public String passage;

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getPassage() {
        return passage;
    }

    public void setPassage(String passage) {
        this.passage = passage;
    }

    public String getKey_phrase() {
        return key_phrase;
    }

    public void setKey_phrase(String key_phrase) {
        this.key_phrase = key_phrase;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String s) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        this.date = formatter.format(date);
    }
}
