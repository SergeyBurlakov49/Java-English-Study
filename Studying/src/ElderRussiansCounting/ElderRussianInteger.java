package ElderRussiansCounting;

public class ElderRussianInteger extends Number{

    private enum ElderRussianNumbers {
        Ноль(0), Целковый(1), Полушка(2), Четвертушка(3),
        Осьмушка(4), Пудовичок(5), Медячок(6), Серебрячок(7),
        Золотничок(8), Девятичок(9);

        final int decimalAnalog;

        ElderRussianNumbers(int decimalAnalog){
            this.decimalAnalog = decimalAnalog;
        }
    }
    private final boolean isPositive;

    private ElderRussianNumbers [] array;
    int intEqual;

    public ElderRussianInteger(Number value){
        if (value == null){
            intEqual = 0;
        }
        else {
            intEqual = value.intValue();
        }
            isPositive = checkPositive(intEqual);
            int digits = countDigits(intEqual);
            writeArray(intEqual, digits);

    }

    public ElderRussianInteger add(ElderRussianInteger number){
        if(number == null){
            return this;
        }
        int intValue = (this.intEqual + number.intEqual);
        return new ElderRussianInteger(intValue);
    }

    public ElderRussianInteger subtract(ElderRussianInteger number){
        if(number == null){
            return this;
        }
        int intValue = (this.intEqual - number.intEqual);
        return new ElderRussianInteger(intValue);
    }

    public ElderRussianInteger multiply(ElderRussianInteger number){
        if(number == null){
            return this;
        }
        int intValue = (int) Math.pow(this.intEqual, number.intEqual);
        return new ElderRussianInteger(intValue);
    }

    public ElderRussianInteger divide(ElderRussianInteger number){
        if(number == null){
            return this;
        }
        int intValue = (int) Math.round(Math.pow(this.intEqual, (1.0 / (double) number.intEqual)));
        return new ElderRussianInteger(intValue);
    }

    @Override
    public int intValue() {
        return intEqual;
    }

    @Override
    public long longValue() {
        return intEqual;
    }

    @Override
    public float floatValue() {
        return intEqual;
    }

    @Override
    public double doubleValue() {
        return intEqual;
    }

    private boolean checkPositive(int val){
        return val >= 0;
    }

    private int countDigits(int val){
        int digitCounter = 0;
        if (val == -2147483648) val++;
        for (int divider = 1;Math.abs(val) / divider > 0; digitCounter++, divider *= 10);
        if (digitCounter == 0) digitCounter = 1;
        if (digitCounter > 10) digitCounter = 10;
        return digitCounter;
    }

    private void writeArray(int val, int digits){
        if (val == -2147483648) val++;
        val = Math.abs(val);
        array = new ElderRussianNumbers[digits];
        for (int writer = 0; digits > 0; writer++, digits--){
            int num = (int) (val / Math.pow(10, digits - 1));
            array[(int) writer] = ElderRussianNumbers.values()[num];
            val = (int) (val - num * Math.pow(10, digits - 1));
        }
    }

    public String toString(){
        int size = 4;
        size += (array.length - 1) * 4;
        for (int i = 1; i < array.length; i++) {
            size += i * 11;
        }
        StringBuilder sb = new StringBuilder(size);
        if (this.intEqual < 0)sb.append("Минус ");
        for (int i = 0; i < array.length; i++){
            sb.append(array[i]);
            for (int i1 = array.length - 1; i1 > i; i1--){
                sb.append(" Десятичков");
            }
            sb.append(", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        if (array.length > 1 && array[array.length - 1] == ElderRussianNumbers.Ноль){
            int i = sb.lastIndexOf(", Ноль");
            sb.delete(i, i + 6);
        }
        return sb.toString();
    }
}
