package com.ferox.game.world.entity.combat.ranged;

public enum BowReqs {

    KBOW(4734, 4740),
    SHORTBOW(841, 882, 884),
    LONGBOW(839, 882, 884),

    OAK_SHORT(843, 882, 884),
    OAKLONG(845, 882, 884),

    WILLOW_SHORT(849, 882, 884, 886),
    WILLOWLONG(847, 882, 884, 886),

    MAPLE_SHORT(853, 882, 884, 886, 888, 890),
    MAPLELONG(851, 882, 884, 886, 888, 890),

    YEW_SHORT(857, 882, 884, 886, 888, 890, 892),
    YEWLONG(855, 882, 884, 886, 888, 890, 892),

    MAGIC_SHORT(861, 882, 884, 886, 888, 890, 892, 21326),
    MAGICLONG(859, 882, 884, 886, 888, 890, 892, 21326),
    MAGIC_SHORT_I(12788, 882, 884, 886, 888, 890, 892, 21326),

    SEERCULL(6724, 882, 884, 886, 888, 890, 892),

    THIRD_AGE_BOW(12424, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326),

    DBOW(11235, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326),
    DBOW2(12765, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326), // Cosmetic
    DBOW3(12766, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326), // Cosmetic
    DBOW4(12767, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326), // Cosmetic
    DBOW5(12768, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326), // Cosmetic

    TWISTED_BOW(20997, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326),
    TWISTED_BOW_ORANGE(30036, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326),
    TWISTED_BOW_PURPLE(30037, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326),
    TWISTED_BOW_I(30183, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326),
    SANGUINE_TWISTED_BOW(28957, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326),

    ELEMENTAL_BOW(12081, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326, 4160, 78, 2866),

    DARKLORD_BOW(30315, 882, 884, 886, 888, 890, 892, 11212, 20389, 11227, 11228, 11229, 21326, 4160, 78, 2866, 4160, 78, 2866),
    ;

    public int bow;
    public int[] ammo;

    BowReqs(int bow, int... ammo) {
        this.bow = bow;
        this.ammo = ammo;
    }
}