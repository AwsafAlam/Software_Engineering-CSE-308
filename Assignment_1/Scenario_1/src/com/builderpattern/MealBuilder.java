package com.builderpattern;

import java.util.List;

public interface MealBuilder {
    void mainitem(String mainItem);
    void sideitem(String sideItem);
    void drinks(String drinks);
    void toy(String toy);
    CompletedOrder GetMeal();
}
