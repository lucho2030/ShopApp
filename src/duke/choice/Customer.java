package duke.choice;

public class Customer {
    String name;
    String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize (int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                size = "S";
                break;

            case 4:
            case 5:
            case 6:
                size = "M";
                break;

            case 7:
            case 8:
            case 9:
                size = "L";
                break;
            default:
                size = "XL";
        }
    }

}
