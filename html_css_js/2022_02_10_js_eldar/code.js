class Car {

    km = 0;

    constructor(number, speed, color) {
        this.number = number;
        this.speed = speed;
        this.color = color;
    }

    drive(distnce) {
        this.km += distnce;
    }

    toString() {
        return "Car[number=" + this.number + ", speed=" + this.speed +
         ", color=" + this.color + ", km=" + this.km + "]";
    }

}