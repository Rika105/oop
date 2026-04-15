package lab1;
class Temperature {
    private double value; 
    private char scale; 

   
    public Temperature() {
        this(0, 'C');
    }

    public Temperature(double value) {
        this(value, 'C');
    }

    public Temperature(char scale) {
        this(0, scale);
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }


    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9 * (value / 5)) + 32;
        }
    }
    
    public char getScale() {
        return scale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setValueAndScale(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
}
