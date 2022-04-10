package cho_06

class Rational(n: Int, d: Int) {
	require(d != 0)
	val numer: Int = n
	val denum: Int = d
	override def toString: String = numer + "/" + denum
	def add(that: Rational): Rational = {
		new Rational(numer * that.denum + that.numer * denum,
			denum * that.denum)
	}
}
