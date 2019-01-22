public enum Condition {
//    SLEEPING, AWAKEN, DEAD

    SLEEPING("Спит",   true),
    AWAKEN     ("Проснулся",          true),
    DEAD     ("Умер",          false);



    private final String sleeping;

    private final boolean live;

    private Condition(String sleeping,  boolean live) {
        this.sleeping = sleeping;

        this.live = live;
    }

    public String getSleeping() {
        return sleeping;
    }


    public boolean isLive(){
        return live;
    }
    }

