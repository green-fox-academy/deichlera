import java.util.ArrayList;

public class Carrier {

    ArrayList<Aircraft> aircrafts = new ArrayList<>();
    public int storeOfAmmo;
    public int health;
    public int sumAllOfAmmo = 0;

    public Carrier(ArrayList<Aircraft> aircrafts, int storeOfAmmo, int health) {
        this.aircrafts = aircrafts;
        this.storeOfAmmo = storeOfAmmo;
        health = health;
    }

    public void add(Carrier carrier, Aircraft aircraft) {
        carrier.aircrafts.add(carrier.aircrafts.size(), aircraft);
    }

    public void fill() {
        int summa = sumAllMissingAmmo();
        if (storeOfAmmo == 0) {
            //throw exception;
        } else if (storeOfAmmo < summa) {
            for (int i = 0; i < aircrafts.size(); i++) {
                if (aircrafts.get(i).isPriority() == true) {
                    if ((aircrafts.get(i).maxAmmo - aircrafts.get(i).ammo) < storeOfAmmo) {
                        aircrafts.get(i).ammo = aircrafts.get(i).maxAmmo;
                    } else {
                        aircrafts.get(i).ammo += storeOfAmmo;
                    }
                } else {
                    if ((aircrafts.get(i).maxAmmo - aircrafts.get(i).ammo) < storeOfAmmo) {
                        aircrafts.get(i).ammo = aircrafts.get(i).maxAmmo;
                    } else {
                        aircrafts.get(i).ammo += storeOfAmmo;
                    }
                }
            }
        } else {
            for (int j = 0; j < aircrafts.size(); j++) {
                if ((aircrafts.get(j).maxAmmo - aircrafts.get(j).ammo) < storeOfAmmo) {
                    aircrafts.get(j).ammo = aircrafts.get(j).maxAmmo;
                } else {
                    aircrafts.get(j).ammo += storeOfAmmo;
                }
            }
        }
    }

    public int sumAllMissingAmmo() {
        int summa = 0;
        for (int i = 0; i < aircrafts.size(); i++) {
            summa += (aircrafts.get(i).maxAmmo - aircrafts.get(i).ammo);
        }
        return summa;
    }

    public void fight(Carrier carrier, Carrier carrier2) {
        for (int i = 0; i < carrier.aircrafts.size(); i++) {
            aircrafts.get(i).fight();
            carrier.health -= aircrafts.get(i).ammo;
        }
    }

    public String getStatus(Carrier carrier) {
        StringBuilder sb = new StringBuilder(55);
        sb.append("HP ");
        sb.append(this.health);
        sb.append("Aircraft count ");
        sb.append(this.aircrafts.size());
        sb.append("Ammo storage: ");
        sb.append(this.storeOfAmmo);
        sb.append("Total damage ");
        sb.append(allOfAmmo(sumAllOfAmmo));
        sb.append(carrier.status());
        return sb.toString();
    }

    public int allOfAmmo(int sumAllOfAmmo) {
        for (int i = 0; i < aircrafts.size(); i++) {
            sumAllOfAmmo += aircrafts.get(i).ammo;
        }
        return sumAllOfAmmo;
    }

    public String status(){
        for (int i = 0; i < aircrafts.size(); i++) {
            System.out.println(aircrafts.get(i).getStatus());
        }
        return null;
    }
}
