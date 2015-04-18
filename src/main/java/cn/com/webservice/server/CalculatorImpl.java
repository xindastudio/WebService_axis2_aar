package cn.com.webservice.server;



/**
 * @author wuliwei
 *
 */
public class CalculatorImpl implements Calculator {

	/** (non-Javadoc)
	 * @see cn.com.webservice.server.Calculator#addInteger(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Integer addInteger(Integer pSummand, Integer pAddend) {
		if (null == pSummand) {
			return pAddend;
		}
		if (null == pAddend) {
			return pSummand;
		}
		return pSummand + pAddend;
	}

	/** (non-Javadoc)
	 * @see cn.com.webservice.server.Calculator#addString(java.lang.String, java.lang.String)
	 */
	@Override
	public String addString(String pSummand, String pAddend) {
		if (null == pSummand) {
			return pAddend;
		}
		if (null == pAddend) {
			return pSummand;
		}
		return pSummand + pAddend;
	}

	/** (non-Javadoc)
	 * @see cn.com.webservice.server.Calculator#addIntegerArray(java.lang.Integer[], java.lang.Integer[])
	 */
	@Override
	public Integer[] addIntegerArray(Integer[] pSummand, Integer[] pAddend) {
		if (null == pSummand || 0 == pSummand.length) {
			return pAddend;
		}
		if (null == pAddend || 0 == pAddend.length) {
			return pSummand;
		}
		Integer[] result = null;
		if (pSummand.length >= pAddend.length) {
			result = new Integer[pSummand.length];
		} else {
			result = new Integer[pAddend.length];
		}
		for (int i = 0; i < result.length; i++) {
			if (pSummand.length > i && null != pSummand[i]) {
				result[i] = pSummand[i];
			}
			if (pAddend.length > i && null != pAddend[i]) {
				result[i] = null == result[i] ? pAddend[i] : result[i] + pAddend[i];
			}
		}
		return result;
	}

	/** (non-Javadoc)
	 * @see cn.com.webservice.server.Calculator#addStringArray(java.lang.String[], java.lang.String[])
	 */
	@Override
	public String[] addStringArray(String[] pSummand, String[] pAddend) {
		if (null == pSummand || 0 == pSummand.length) {
			return pAddend;
		}
		if (null == pAddend || 0 == pAddend.length) {
			return pSummand;
		}
		String[] result = null;
		if (pSummand.length >= pAddend.length) {
			result = new String[pSummand.length];
		} else {
			result = new String[pAddend.length];
		}
		for (int i = 0; i < result.length; i++) {
			if (pSummand.length > i && null != pSummand[i]) {
				result[i] = pSummand[i];
			}
			if (pAddend.length > i && null != pAddend[i]) {
				result[i] = null == result[i] ? pAddend[i] : result[i] + pAddend[i];
			}
		}
		return result;
	}

}
