package model;

public class Hero extends Character {
    public Hero(String name){
        setName(name);
    }
    private boolean isFlying;

    public boolean isIsFlying() {
        return this.isFlying;
    }

    public void setIsFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }
    /* (non-Javadoc)
     * @see model.Character#attack(model.Hero)
     */
    @Override
    public void attack(Hero hero){
        System.out.println(this.getName() + "은 " + hero.getName()+"과 싸움을 했다.");
    }
}
