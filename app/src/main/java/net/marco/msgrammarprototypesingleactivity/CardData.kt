package net.marco.msgrammarprototypesingleactivity

/**
 * This class is a simple data helper class.
 * It will be replaced by a database in the full version of the app.
 */
class CardData {

    companion object {

        /**
         * Data for proper noun cards.
         */
        val imagesPN = intArrayOf(
            R.drawable.card_pn_luis,
            R.drawable.card_pn_tomas,
            R.drawable.card_pn_monica,
            R.drawable.card_pn_luis_monica,
            R.drawable.card_pn_monica_rosa,
            R.drawable.card_pn_tomas_luis
        )
        val symbolsPN = arrayOf(
            "3SM",
            "3SM",
            "3SF",
            "3PM",
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
}