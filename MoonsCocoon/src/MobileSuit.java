public class MobileSuit {
    String name;
    String desc;
    Integer damage;
    Integer defense;
    Integer speed;
    Integer dash;
    String dpress;
    Integer Fun;
    Integer Power;
    MobileSuit(String nom,String desc,Integer dam,Integer def,Integer sp,Integer da,String dp,Integer fun, Integer pow){
        this.name= nom;
        this.desc= desc;
        this.damage=dam;
        this.defense=def;
        this.speed=sp;
        this.dash=da;
        this.dpress=dp;
        this.Fun=fun;
        this.Power=pow;


        }
        public String toString(){
        String mob= "";
        mob=mob.concat(this.name)+";".concat(this.desc)+";".concat(String.valueOf(this.damage))+";".concat(String.valueOf(this.defense))+";".concat(String.valueOf(this.speed))+";".concat(String.valueOf(this.dash))+";".concat(this.dpress)+";".concat(String.valueOf(this.Fun))+";".concat(String.valueOf(this.Power));
        return mob;
        }
    }
