package Assignment7;
import java.util.ArrayList;


public class News implements INew {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;
    int RateList[] = new int[3];

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getTitle(){
        return Title;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public String getPublishDate(){
        return PublishDate;
    }

    public void setPublishDate(String PublishDate){
        this.PublishDate = PublishDate;
    }

    public String getAuthor(){
        return Author;
    }

    public void setAuthor(String Author){
        this.Author = Author;
    }

    public String getContent(){
        return Content;
    }

    public void setContent(String Content){
        this.Content = Content;
    }

    public float getAverageRate(){
        return AverageRate;
    }

    @Override
    public void Display(){
        System.out.println("ID: " + ID);
        System.out.println("Title: " + Title);
        System.out.println("PublishDate: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("AverageRate: " + AverageRate);
    }

    public void Calculate(){
        int sum = 0;
        for (int i=0; i<3;i++){
            sum = sum + RateList[i];
        }
        AverageRate = sum/3;
    }

    public News(int ID, String Title, String PublishDate, String Author, String Content, int[] RateList){
        this.ID = ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
        this.RateList = RateList;

    }

}
