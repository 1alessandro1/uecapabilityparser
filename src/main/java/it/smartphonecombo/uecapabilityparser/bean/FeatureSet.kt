package it.smartphonecombo.uecapabilityparser.bean

import it.smartphonecombo.uecapabilityparser.bean.lte.FeaturePerCCLte

data class FeatureSet(
    val featureSetsPerCC: List<FeaturePerCCLte>?,
    val type: Int
) {
    companion object {
        const val UPLINK = 1
        const val DOWNlINK = 0
    }

    override fun toString(): String {
        val typeString = when (type) {
            DOWNlINK -> "DL"
            UPLINK -> "UL"
            else -> "Unknown"
        }
        return "FeatureSet(featureSetsPerCC=$featureSetsPerCC, type=$typeString)"
    }
}
