void setup()
{
  size(600,400);
}

void draw()
{
  background(255); //sets the background colour as white
  //creates the outer red circle
  stroke(#CE1726); 
  fill(#CE1726);
  circle(mouseX,mouseY,250);
  //circle(300,200,250);
  //creates the inner white circle
  stroke(255);
  fill(255);
  circle(mouseX,mouseY,160);
  //circle(300,200,160);
  //creates the blue rectangle
  stroke(#38439B);
  fill(#38439B);
  rectMode(CENTER);
  rect(mouseX,mouseY,300,50);
  //rect(300,200,300,50);
  //creates the text
  fill(255);
  textAlign(CENTER,CENTER);
  textSize(40);
  text("UNDERGROUND",mouseX,mouseY);
  //text("UNDERGROUND",300,200);
}