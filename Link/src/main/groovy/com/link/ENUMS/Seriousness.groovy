package com.link.ENUMS

enum Seriousness {
    Serious('Serious'),
    Very_Serious('Very serious'),
    Casual('Casual')

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