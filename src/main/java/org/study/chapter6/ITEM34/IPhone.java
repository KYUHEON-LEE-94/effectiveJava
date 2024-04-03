package org.study.chapter6.ITEM34;

/**
 * packageName    : org.study.chapter6.ITEM34
 * fileName       : IPhone
 * author         : heon
 * date           : 2024-04-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03           heon               최초 생성
 */
public enum IPhone {
    IPHONE11(6.1, "A13", 1200),
    IPHONE11PRO(5.8, "A13", 1200),
    IPHONE11PROMAX(6.5, "A13", 1200),
    IPHONESE(4.7, "A13", 700),
    IPHONE12(6.1, "A14", 1200),
    IPHONE12MINI(5.4, "A14", 1200),
    IPHONE12PRO(6.1, "A14", 1200),
    IPHONE12PROMAX(6.7, "A14", 1200);

    private final double inch;
    private final String process;
    private final int cameraPixel;

    private static final double centimeter = 2.54;

    IPhone(double inch, String process, int cameraPixel){
        this.inch = inch;
        this.process = process;
        this.cameraPixel = cameraPixel;
    }

    public double inch(){
        return this.inch;
    }
    public String process(){
        return this.process;
    };
    public int cameraPixel(){
        return this.cameraPixel;
    };

    public double calcurateInchToCentimeter(double inch) {
        return inch * centimeter;
    }
}
