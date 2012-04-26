package org.andengine.util.escape;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 3:27:44 PM - Apr 26, 2012
 */
public class XMLUnescaper {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private static final UnescaperLookupMap sUnescaperEntityMap = new UnescaperLookupMap() {
		{
			/* BASIC */
			this.add("quot", 34); // " - double-quote
			this.add("amp", 38); // & - ampersand
			this.add("lt", 60); // < - less-than
			this.add("gt", 62); // > - greater-than

			/* XML */
			this.add("apos", 39); // XML apostrophe

			this.init();
		}
	};

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public static String unescape(final CharSequence pCharSequence) {
		return Unescaper.unescape(pCharSequence, XMLUnescaper.sUnescaperEntityMap);
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
