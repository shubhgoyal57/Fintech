package com.link.ENUMS

enum Visibility{
    PRIVATE( 'PRIVATE'),
    PUBLIC( 'PUBLIC')

    String name

    public Visibility(String name)
    {
        this.name=name
    }

    public getName()
    {
        return name
    }


}
