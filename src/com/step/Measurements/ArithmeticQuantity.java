//package com.step.Measurements;
//
//import java.math.BigDecimal;
//import java.security.InvalidParameterException;
//
//public class ArithmeticQuantity extends Quantity {
//    ArithmeticQuantity(BigDecimal value, Unit unit) {
//        super(value, unit);
//    }
//
//    Quantity add(Quantity otherQuantity) throws NoSuchMethodException {
//        if (!hasSameClass(otherQuantity)) throw new InvalidParameterException();
//        BigDecimal sumOfQuantities = this.calculateBaseValue().add(otherQuantity.calculateBaseValue());
//        BigDecimal quantitiesSumInInches = this.unit.convertToStandard(sumOfQuantities);
//        return new Quantity(quantitiesSumInInches, this.unit.getStandardUnit());
//    }
//}
