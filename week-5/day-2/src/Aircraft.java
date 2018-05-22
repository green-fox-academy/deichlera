public class Aircraft {

    public int maxAmmo;
    public int ammo;
    public int basicDamage;
    public int damage=ammo + basicDamage;

    public Aircraft() {
    }

    public void fight(){
        this.ammo=0;
        System.out.println(this.damage);
    }

    public void refill(int number){
        int remaining;
        if (number >= this.ammo+maxAmmo){
            ammo = maxAmmo;
            remaining = number - (maxAmmo-ammo);
            System.out.println(remaining);
        }
        else {
            ammo += number;
            remaining = maxAmmo - ammo;
            System.out.println(remaining);
        }
    }

    public void getType(){
        this.getClass().getName();
    }

    public String getStatus() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("Type ");
        sb.append(this.getClass().getName());
        sb.append("Ammo: ");
        sb.append(this.ammo);
        sb.append("Base damage: ");
        sb.append(this.basicDamage);
        sb.append("Full damage ");
        sb.append(this.damage);
        return sb.toString();
    }

    public boolean isPriority(){
        return true;
    }
}
