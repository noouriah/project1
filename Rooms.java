public class Rooms implements Interface{
    private int floorNo,roomNu;
    private String roomType;
    private double roomprice;
    private boolean isFree;

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNU) {
        this.floorNo = floorNo;
    }

    public int getRoomNu() {
        return roomNu;
    }

    public void setRoomNu(int roomNu) {
        this.roomNu = roomNu;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(double roomprice) {
        this.roomprice = roomprice;
    }

    @Override
    public Object search() {
        return null;
    }
}
