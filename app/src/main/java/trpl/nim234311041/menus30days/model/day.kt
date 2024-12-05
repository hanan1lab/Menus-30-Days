package trpl.nim234311041.menus30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Day (
    @StringRes val nameRes : Int,
    @StringRes val titleRes : Int,
    @StringRes val descriptionRes : Int,
    @DrawableRes val imageRes : Int,
)
