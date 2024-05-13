package com.telran.prof.lesson_21.generics;

public interface Converter <Entity, Dto> { // may be entered as word for parameters

    Dto toDTo(Entity entity);

    Entity toEntity(Dto dto);
}
