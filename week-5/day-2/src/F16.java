public class F16 extends Aircraft {

    public F16(int maxAmmo, int ammo, int basicDammage) {
        this.maxAmmo=8;
        this.ammo=0;
        this.basicDamage=30;
    }

    @Override
    public boolean isPriority() {
        return false;
    }
}
