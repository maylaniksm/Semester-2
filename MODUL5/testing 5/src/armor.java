public class armor {
    double defensepoint;
    public double realdefensepoint;
    double eledefpoint;
    protected element ele;

    public double getDefensepoint() {
        return defensepoint;
    }

    public void setDefensepoint(double defensepoint) {
        this.defensepoint = defensepoint;
    }

    public double getRealdefensepoint() {
        return realdefensepoint;
    }

    public void setRealdefensepoint(double realdefensepoint) {
        this.realdefensepoint = realdefensepoint;
    }

    public double getEledefpoint() {
        return eledefpoint;
    }

    public void setEledefpoint(double eledefpoint) {
        this.eledefpoint = eledefpoint;
    }

    public element getEle() {
        return ele;
    }

    public void setEle(element ele) {
        this.ele = ele;
    }

    public armor(double defensepoint, element el){
        this.defensepoint = defensepoint;
        this.ele = el;
        this.eledefpoint= el.getAdddefense();
        this.realdefensepoint=this.defensepoint+el.getAdddefense();
    }

    public void kurangarmor(double damage){
      this.defensepoint -= damage;
    }

    public void tipeelement(){
        if (ele instanceof api){
            System.out.println("Element : Cyro");
        } else if (ele instanceof air) {
            System.out.println("Element : Hydro");
        } else if (ele instanceof listrik){
            System.out.println("Element : Elektro");
        }
    }

}
