package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;


@Data
public class ResultBackpack {
    private List<ResultUserEq> eq;
    private List<ResultUserItem> consumables;
    private List<ResultUserItem> materials;
    private List<ResultUserEq> titles;
    private List<ResultUserEq> skins;
    private List<ResultUserEq> halos;
    private List<ResultUserEq> pets;
    private Boolean isEq;
    private Boolean isConsumables;
    private Boolean isMaterials;
    private Boolean isTitles;
    private Boolean isSkins;
    private Boolean isHalos;
    private Boolean isPets;
    private List<Integer> eqBackpack;
    private List<Integer> consumablesBackpack;
    private List<Integer> materialsBackpack;
    private List<Integer> titlesBackpack;
    private List<Integer> skinsBackpack;
    private List<Integer> halosBackpack;
    private List<Integer> petsBackpack;
}
