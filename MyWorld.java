import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    
    public MyWorld()
    {    
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 200, 200);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    public int speed = 1;
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 10 == 0) speed++;
    }  
    
    public int score = 0;
    Label scoreLabel;
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
