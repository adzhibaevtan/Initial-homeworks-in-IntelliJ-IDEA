public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.getWeapon().setWeapon(WeaponType.GRIMOIRE);
        boss.setDamage(100);
        boss.setHealth(1000);
        boss.getWeapon().setWeaponType("Magic");
        System.out.println(boss.info());
        System.out.println(" ");
        Skeleton skeleton1 = new Skeleton();
        Skeleton skeleton2 = new Skeleton();
        skeleton1.setDamage(10);
        skeleton1.setHealth(300);
        skeleton1.setNumberOfArrows(30);
        skeleton1.getWeapon().setWeapon(WeaponType.BOW);
        skeleton1.getWeapon().setWeaponType("Throwing");
        skeleton2.setDamage(50);
        skeleton2.setHealth(500);
        skeleton2.getWeapon().setWeapon(WeaponType.SWORD);
        skeleton2.getWeapon().setWeaponType("Cold");

        System.out.println(skeleton1.info());
        System.out.println(" ");
        System.out.println(skeleton2.info());
    }
}