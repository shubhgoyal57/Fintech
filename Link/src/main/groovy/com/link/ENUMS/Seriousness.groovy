package com.link.ENUMS

enum Seriousness {
    SERIOUS('SERIOUS'),
    VERY_SERIOUS('VERY SERIOUS'),
    CASUAL('CASUAL')

    String name
    public Seriousness(String name)
    {
        this.name=name
    }
    public getName()
    {
        return name
    }

}