class Shape{
    constructor(width, height, color){
        this.width = width;
        this.height = height ;
        this.color = color ;
    }
    draw(){
        console.log(`drawing ${this.color} color of`);
    }

    getArea(){
        return this.width * this.height;
    }
}

class Rectangle extends Shape{}
class Triangle extends Shape{
    //다양성 상속 된걸 바꾸면서 다양하게 이용 가능하다.
    draw(){
        super.draw();//밑에서 △로 바꾸었지만 super을 붙임으로써 위에 값을 불러 올 수도 있다.
        console.log('△')
    }
    getArea(){
        return (this.width * this.height) / 2;
    }
}
const rectangle = new Rectangle(20, 20, 'blue');
rectangle.draw();
console.log(rectangle.getArea());
const rectangles = new Triangle(20, 20, 'blue');
rectangles.draw();
console.log(rectangles.getArea());
