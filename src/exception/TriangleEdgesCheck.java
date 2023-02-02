public class TriangleEdgesCheck {
    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ!");
        } else if(a<=0||b<=0||c<=0){
            throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ!");
        }else {
            throw new IllegalTriangleException("Tam giác hợp lệ!");
        }
    }
}