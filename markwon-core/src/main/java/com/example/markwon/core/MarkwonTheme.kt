package com.example.markwon.core

import android.graphics.Typeface
import androidx.annotation.ColorInt
import androidx.annotation.Px
import androidx.annotation.Size

class MarkwonTheme {



    protected val BLOCK_QUOTE_DEF_COLOR_ALPHA = 25

    protected val CODE_DEF_BACKGROUND_COLOR_ALPHA = 25
    protected val CODE_DEF_TEXT_SIZE_RATIO = .87f

    protected val HEADING_DEF_BREAK_COLOR_ALPHA = 75

    // taken from html spec (most browsers render headings like that)
    // is not exposed via protected modifier in order to disallow modification
    private val HEADING_SIZES = floatArrayOf(
        2f, 1.5f, 1.17f, 1f, .83f, .67f
    )

    protected val THEMATIC_BREAK_DEF_ALPHA = 25

    var linkColor = 0

    // specifies whether we underline links, by default is true
    // @since 4.5.0
    var isLinkedUnderlined = false

    // used in quote, lists
    var blockMargin = 0

    // by default it's 1/4th of `blockMargin`
    var blockQuoteWidth = 0

    // by default it's text color with `BLOCK_QUOTE_DEF_COLOR_ALPHA` applied alpha
    var blockQuoteColor = 0

    // by default uses text color (applied for un-ordered lists & ordered (bullets & numbers)
    var listItemColor = 0

    // by default the stroke color of a paint object
    var bulletListItemStrokeWidth = 0

    // width of bullet, by default min(blockMargin, height) / 2
    var bulletWidth = 0

    // by default - main text color
    var codeTextColor = 0

    // by default - codeTextColor
    var codeBlockTextColor = 0

    // by default 0.1 alpha of textColor/codeTextColor
    var codeBackgroundColor = 0

    // by default codeBackgroundColor
    var codeBlockBackgroundColor = 0

    // by default `width` of a space char... it's fun and games, but span doesn't have access to paint in `getLeadingMargin`
    // so, we need to set this value explicitly (think of an utility method, that takes TextView/TextPaint and measures space char)
    var codeBlockMargin = 0

    // by default Typeface.MONOSPACE
    var codeTypeface: Typeface? = null

    var codeBlockTypeface: Typeface? = null

    // by default a bit (how much?!) smaller than normal text
    // applied ONLY if default typeface was used, otherwise, not applied
    var codeTextSize = 0

    var codeBlockTextSize = 0

    // by default paint.getStrokeWidth
    var headingBreakHeight = 0

    // by default, text color with `HEADING_DEF_BREAK_COLOR_ALPHA` applied alpha
    var headingBreakColor = 0

    // by default, whatever typeface is set on the TextView
    // @since 1.1.0
    var headingTypeface: Typeface? = null

    // by default, we use standard multipliers from the HTML spec (see HEADING_SIZES for values).
    // this library supports 6 heading sizes, so make sure the array you pass here has 6 elements.
    // @since 1.1.0
    var headingTextSizeMultipliers: FloatArray?

    // by default textColor with `THEMATIC_BREAK_DEF_ALPHA` applied alpha
    var thematicBreakColor = 0

    // by default paint.strokeWidth
    var thematicBreakHeight = 0

    constructor(builder: Builder) {
        linkColor = builder.linkColor
        isLinkedUnderlined = builder.isLinkUnderlined
        blockMargin = builder.blockMargin
        blockQuoteWidth = builder.blockQuoteWidth
        blockQuoteColor = builder.blockQuoteColor
        listItemColor = builder.listItemColor
        bulletListItemStrokeWidth = builder.bulletListItemStrokeWidth
        bulletWidth = builder.bulletWidth
        codeTextColor = builder.codeTextColor
        codeBlockTextColor = builder.codeBlockTextColor
        codeBackgroundColor = builder.codeBackgroundColor
        codeBlockBackgroundColor = builder.codeBlockBackgroundColor
        codeBlockMargin = builder.codeBlockMargin
        codeTypeface = builder.codeTypeface
        codeBlockTypeface = builder.codeBlockTypeface
        codeTextSize = builder.codeTextSize
        codeBlockTextSize = builder.codeBlockTextSize
        headingBreakHeight = builder.headingBreakHeight
        headingBreakColor = builder.headingBreakColor
        headingTypeface = builder.headingTypeface
        headingTextSizeMultipliers = builder.headingTextSizeMultipliers
        thematicBreakColor = builder.thematicBreakColor
        thematicBreakHeight = builder.thematicBreakHeight
    }
}
    class Builder {
        internal var linkColor = 0
        internal var isLinkUnderlined = true // @since 4.5.0

        internal var blockMargin = 0
        internal var blockQuoteWidth = 0
        internal var blockQuoteColor = 0
        internal var listItemColor = 0
        internal var bulletListItemStrokeWidth = 0
        internal var bulletWidth = 0
        internal var codeTextColor = 0
        internal var codeBlockTextColor = 0 // @since 1.0.5

        internal var codeBackgroundColor = 0
        internal var codeBlockBackgroundColor = 0 // @since 1.0.5

        internal var codeBlockMargin = 0
        internal var codeTypeface: Typeface? = null
        internal var codeBlockTypeface: Typeface? = null // @since 3.0.0

        internal var codeTextSize = 0
        internal var codeBlockTextSize = 0 // @since 3.0.0

        internal var headingBreakHeight = -1
        internal var headingBreakColor = 0
        internal var headingTypeface: Typeface? = null
        internal var headingTextSizeMultipliers: FloatArray? = null
        internal var thematicBreakColor = 0
        internal var thematicBreakHeight = -1

        constructor() {}

        constructor(theme: MarkwonTheme) {
            linkColor = theme.linkColor
            isLinkUnderlined = theme.isLinkedUnderlined
            blockMargin = theme.blockMargin
            blockQuoteWidth = theme.blockQuoteWidth
            blockQuoteColor = theme.blockQuoteColor
            listItemColor = theme.listItemColor
            bulletListItemStrokeWidth = theme.bulletListItemStrokeWidth
            bulletWidth = theme.bulletWidth
            codeTextColor = theme.codeTextColor
            codeBlockTextColor = theme.codeBlockTextColor
            codeBackgroundColor = theme.codeBackgroundColor
            codeBlockBackgroundColor = theme.codeBlockBackgroundColor
            codeBlockMargin = theme.codeBlockMargin
            codeTypeface = theme.codeTypeface
            codeTextSize = theme.codeTextSize
            headingBreakHeight = theme.headingBreakHeight
            headingBreakColor = theme.headingBreakColor
            headingTypeface = theme.headingTypeface
            headingTextSizeMultipliers = theme.headingTextSizeMultipliers
            thematicBreakColor = theme.thematicBreakColor
            thematicBreakHeight = theme.thematicBreakHeight
        }

        fun linkColor(@ColorInt linkColor: Int): Builder {
            this.linkColor = linkColor
            return this
        }

        fun isLinkUnderlined(isLinkUnderlined: Boolean): Builder {
            this.isLinkUnderlined = isLinkUnderlined
            return this
        }

        fun blockMargin(@Px blockMargin: Int): Builder {
            this.blockMargin = blockMargin
            return this
        }

        fun blockQuoteWidth(@Px blockQuoteWidth: Int): Builder {
            this.blockQuoteWidth = blockQuoteWidth
            return this
        }

        fun blockQuoteColor(@ColorInt blockQuoteColor: Int): Builder {
            this.blockQuoteColor = blockQuoteColor
            return this
        }

        fun listItemColor(@ColorInt listItemColor: Int): Builder {
            this.listItemColor = listItemColor
            return this
        }

        fun bulletListItemStrokeWidth(@Px bulletListItemStrokeWidth: Int): Builder {
            this.bulletListItemStrokeWidth = bulletListItemStrokeWidth
            return this
        }

        fun bulletWidth(@Px bulletWidth: Int): Builder {
            this.bulletWidth = bulletWidth
            return this
        }

        fun codeTextColor(@ColorInt codeTextColor: Int): Builder {
            this.codeTextColor = codeTextColor
            return this
        }

        /**
         * @since 1.0.5
         */
        fun codeBlockTextColor(@ColorInt codeBlockTextColor: Int): Builder {
            this.codeBlockTextColor = codeBlockTextColor
            return this
        }

        fun codeBackgroundColor(@ColorInt codeBackgroundColor: Int): Builder {
            this.codeBackgroundColor = codeBackgroundColor
            return this
        }

        /**
         * @since 1.0.5
         */
        fun codeBlockBackgroundColor(@ColorInt codeBlockBackgroundColor: Int): Builder {
            this.codeBlockBackgroundColor = codeBlockBackgroundColor
            return this
        }

        fun codeBlockMargin(@Px codeBlockMargin: Int): Builder {
            this.codeBlockMargin = codeBlockMargin
            return this
        }

        fun codeTypeface(codeTypeface: Typeface): Builder {
            this.codeTypeface = codeTypeface
            return this
        }

        /**
         * @since 3.0.0
         */
        fun codeBlockTypeface(typeface: Typeface): Builder {
            codeBlockTypeface = typeface
            return this
        }

        fun codeTextSize(@Px codeTextSize: Int): Builder {
            this.codeTextSize = codeTextSize
            return this
        }

        /**
         * @since 3.0.0
         */
        fun codeBlockTextSize(@Px codeTextSize: Int): Builder {
            codeBlockTextSize = codeTextSize
            return this
        }

        fun headingBreakHeight(@Px headingBreakHeight: Int): Builder {
            this.headingBreakHeight = headingBreakHeight
            return this
        }

        fun headingBreakColor(@ColorInt headingBreakColor: Int): Builder {
            this.headingBreakColor = headingBreakColor
            return this
        }

        /**
         * @param headingTypeface Typeface to use for heading elements
         * @return self
         * @since 1.1.0
         */
        fun headingTypeface(headingTypeface: Typeface): Builder {
            this.headingTypeface = headingTypeface
            return this
        }

        /**
         * @param headingTextSizeMultipliers an array of multipliers values for heading elements.
         * The base value for this multipliers is TextView\'s text size
         * @return self
         * @since 1.1.0
         */
        fun headingTextSizeMultipliers(@Size(6) headingTextSizeMultipliers: FloatArray): Builder {
            this.headingTextSizeMultipliers = headingTextSizeMultipliers
            return this
        }

        fun thematicBreakColor(@ColorInt thematicBreakColor: Int): Builder {
            this.thematicBreakColor = thematicBreakColor
            return this
        }

        fun thematicBreakHeight(@Px thematicBreakHeight: Int): Builder {
            this.thematicBreakHeight = thematicBreakHeight
            return this
        }
}