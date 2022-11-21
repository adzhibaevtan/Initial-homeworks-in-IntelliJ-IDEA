public class Skeleton extends Boss {
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public String info() {

        return super.info() + "\n Number of arrows: " + getNumberOfArrows();
    }
}
