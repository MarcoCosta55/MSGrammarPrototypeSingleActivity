/**
 * Copyright 2020 Marco Costa.
 */
package net.marco.msgrammarprototypesingleactivity

/**
 * This is a simple data helper class.
 * It will be replaced by a database in the full version of the app.
 */
class CardData {

    /**
     * data for pronoun cards
     */
    val imagesP = intArrayOf(
        R.drawable.card_p_yof,
        R.drawable.card_p_yom,
        R.drawable.card_p_tuf,
        R.drawable.card_p_tum,
        R.drawable.card_p_el,
        R.drawable.card_p_ella,
        R.drawable.card_p_ustedf,
        R.drawable.card_p_ustedm,
        R.drawable.card_p_nosotros,
        R.drawable.card_p_nosotras,
        R.drawable.card_p_ellos,
        R.drawable.card_p_ellas,
        R.drawable.card_p_ustedesf,
        R.drawable.card_p_ustedesm
    )
    val vocalsP = intArrayOf(
        R.raw.yo,
        R.raw.yo,
        R.raw.tu,
        R.raw.tu,
        R.raw.el,
        R.raw.ella,
        R.raw.usted,
        R.raw.usted,
        R.raw.nosotros,
        R.raw.nosotras,
        R.raw.ellos,
        R.raw.ellas,
        R.raw.ustedes,
        R.raw.ustedes
    )
    val symbolsP = arrayOf(
        "1SF",
        "1SM",
        "2SF",
        "2SM",
        "3SM",
        "3SF",
        "3SF",
        "3SM",
        "1PM",
        "1PF",
        "3PM",
        "3PF",
        "3PF",
        "3PM"
    )

    /**
     * Data for verb cards.
     */
    val imagesV = intArrayOf(
        R.drawable.card_v_como,
        R.drawable.card_v_comes,
        R.drawable.card_v_come,
        R.drawable.card_v_comemos,
        R.drawable.card_v_comen,
        R.drawable.card_v_corto,
        R.drawable.card_v_cortas,
        R.drawable.card_v_corta,
        R.drawable.card_v_cortamos,
        R.drawable.card_v_cortan
    )
    val vocalsV = intArrayOf(
        R.raw.como,
        R.raw.comes,
        R.raw.come,
        R.raw.comemos,
        R.raw.comen,
        R.raw.corto,
        R.raw.cortas,
        R.raw.corta,
        R.raw.cortamos,
        R.raw.cortan
    )
    val symbolsV = arrayOf(
        "1S",
        "2S",
        "3S",
        "1P",
        "3P",
        "1S",
        "2S",
        "3S",
        "1P",
        "3P"
    )

    /**
     * Data for noun cards.
     */
    val imagesN = intArrayOf(
        R.drawable.card_n_durazno,
        R.drawable.card_n_ensalada,
        R.drawable.card_n_fresas,
        R.drawable.card_n_mango,
        R.drawable.card_n_manzana,
        R.drawable.card_n_naranja,
        R.drawable.card_n_pan,
        R.drawable.card_n_pera,
        R.drawable.card_n_pollo,
        R.drawable.card_n_uvas
    )
    val vocalsN = intArrayOf(
        R.raw.durazno,
        R.raw.ensalada,
        R.raw.fresas,
        R.raw.mango,
        R.raw.manzana,
        R.raw.naranja,
        R.raw.pan,
        R.raw.pera,
        R.raw.pollo,
        R.raw.uvas
    )
    val symbolsN = arrayOf(
        "3SM",
        "3SF",
        "3PF",
        "3SM",
        "3SF",
        "3SF",
        "3SM",
        "3SF",
        "3SM",
        "3PF"
    )

    /**
     * Data for adjective cards
     */
    val imagesA = intArrayOf(
        R.drawable.card_a_fria,
        R.drawable.card_a_frias,
        R.drawable.card_a_frio,
        R.drawable.card_a_frios,
        R.drawable.card_a_grande,
        R.drawable.card_a_grandes,
        R.drawable.card_a_limpia,
        R.drawable.card_a_limpias,
        R.drawable.card_a_limpio,
        R.drawable.card_a_limpios,
        R.drawable.card_a_pequena,
        R.drawable.card_a_pequenas,
        R.drawable.card_a_pequeno,
        R.drawable.card_a_pequenos,
        R.drawable.card_a_roja,
        R.drawable.card_a_rojas,
        R.drawable.card_a_rojo,
        R.drawable.card_a_rojos,
        R.drawable.card_a_sucia,
        R.drawable.card_a_sucias,
        R.drawable.card_a_sucio,
        R.drawable.card_a_sucios,
        R.drawable.card_a_verde,
        R.drawable.card_a_verdes
    )
    val vocalsA = intArrayOf(
        R.raw.fria,
        R.raw.frias,
        R.raw.frio,
        R.raw.frios,
        R.raw.grande,
        R.raw.grandes,
        R.raw.limpia,
        R.raw.limpias,
        R.raw.limpio,
        R.raw.limpios,
        R.raw.pequena,
        R.raw.pequenas,
        R.raw.pequeno,
        R.raw.pequenos,
        R.raw.roja,
        R.raw.rojas,
        R.raw.rojo,
        R.raw.rojos,
        R.raw.sucia,
        R.raw.sucias,
        R.raw.sucio,
        R.raw.sucios,
        R.raw.verde,
        R.raw.verdes
    )
    val symbolsA = arrayOf(
        "SF",
        "PF",
        "SM",
        "PM",
        "SX",
        "PX",
        "SF",
        "PF",
        "SM",
        "PM",
        "SF",
        "PF",
        "SM",
        "PM",
        "SF",
        "PF",
        "SM",
        "PM",
        "SF",
        "PF",
        "SM",
        "PM",
        "SX",
        "PX"
    )
}