//add class definitions below this line

class Ball {
  float xPosition;
  float yPosition;
  color ballColor;
  int radius;
  float xVelocity;
  float yVelocity;

  Ball(float x, float y) {
    xPosition = x;
    yPosition = y;
    ballColor = color(255, 255, 255);
    radius = 20;
    xVelocity = randomVelocity();
    yVelocity = randomVelocity();
  }

  void drawBall() {
    noStroke();
    fill(ballColor);
    circle(xPosition, yPosition, radius * 2);
  }

  void updateBall() {
    xPosition += xVelocity;
    yPosition += yVelocity;
  }

  void bounceBall() {
    if (xPosition - radius < 0 || xPosition + radius > width) {
      xVelocity *= -1;
      changeColor();
      increaseVelocity("x");
      growBall();
    }

    if (yPosition - radius < 0 || yPosition + radius > height) {
      yVelocity *= -1;
      changeColor();
      increaseVelocity("y");
      growBall();
    }
  }

  void growBall() {
    radius += 1;
  }

  void increaseVelocity(String direction) {
    if (direction.equals("x")) {
      if (xVelocity > 0) {
        xVelocity += 1;
      } else {
        xVelocity -= 1;
      }
    } else {
      if (yVelocity > 0) {
        yVelocity += 1;
      } else {
        yVelocity -= 1;
      }
    }
  }

    void changeColor() {
      int red = floor(random(256));
      int green = floor(random(256));
      int blue = floor(random(256));
      ballColor = color(red, green, blue);
    }

    float randomVelocity() {
      if (random(1) < 0.5) {
        return random(1, 3);
      } else {
        return random(-3, -1);
      }
    }
  }

  //add class definitions above this line

  Ball ball;

  void setup() {
    size(500, 500);
    ball = new Ball(width / 2, height / 2);
  }

  void draw() {
    background(55, 55, 55);
    ball.drawBall();
    ball.updateBall();
    ball.bounceBall();
  }