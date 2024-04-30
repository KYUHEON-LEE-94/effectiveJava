package org.study.chapter8.ITEM49;

import java.math.BigInteger;
import java.util.List;

/**
 * packageName    : org.study.chapter8
 * fileName       : checkParam
 * author         : heon
 * date           : 2024-04-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-29           heon               최초 생성
 */
public class checkParam {
    private BigInteger remainder;
    private List<String> names;

    private BigInteger remainder(BigInteger m) {
        return this.remainder;
    }

    /**
     * Returns a BigInteger whose value is {@code (this mod m}).  This method
     * differs from {@code remainder} in that it always returns a
     * <i>non-negative</i> BigInteger.
     *
     * @param  m the modulus.
     * @return {@code this mod m}
     * @throws ArithmeticException {@code m} &le; 0
     * @see    #remainder
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0)
            throw new ArithmeticException("BigInteger: modulus not positive");

        BigInteger result = this.remainder(m);
        return (result.signum() >= 0 ? result : result.add(m));
    }

    private String get(int index) {
        assert index >= 0;
        return names.get(index);
    }
}
