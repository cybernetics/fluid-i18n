// Generated by Gradle task 'generateCountryShortNameResolver'. Do not edit manually.
package io.fluidsonic.i18n.data

import io.fluidsonic.locale.LocalizedValueResolver
import io.fluidsonic.locale.asHierarchical
import kotlin.Lazy
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

val countryShortNameResolver: LocalizedValueResolver<String, String> =
    CountryShortNameResolver.asHierarchical().freeze()

private object CountryShortNameResolver : LocalizedValueResolver<String, String> {
  private val resolversByLanguage: Map<String?, Lazy<LocalizedValueResolver<String, String>>> =
      hashMapOf(
        "af" to atomicLazy { countryShortNameResolver_af },
        "agq" to atomicLazy { countryShortNameResolver_agq },
        "ak" to atomicLazy { countryShortNameResolver_ak },
        "am" to atomicLazy { countryShortNameResolver_am },
        "ar" to atomicLazy { countryShortNameResolver_ar },
        "as" to atomicLazy { countryShortNameResolver_as },
        "asa" to atomicLazy { countryShortNameResolver_asa },
        "ast" to atomicLazy { countryShortNameResolver_ast },
        "az" to atomicLazy { countryShortNameResolver_az },
        "bas" to atomicLazy { countryShortNameResolver_bas },
        "be" to atomicLazy { countryShortNameResolver_be },
        "bem" to atomicLazy { countryShortNameResolver_bem },
        "bez" to atomicLazy { countryShortNameResolver_bez },
        "bg" to atomicLazy { countryShortNameResolver_bg },
        "bm" to atomicLazy { countryShortNameResolver_bm },
        "bn" to atomicLazy { countryShortNameResolver_bn },
        "bo" to atomicLazy { countryShortNameResolver_bo },
        "br" to atomicLazy { countryShortNameResolver_br },
        "brx" to atomicLazy { countryShortNameResolver_brx },
        "bs" to atomicLazy { countryShortNameResolver_bs },
        "ca" to atomicLazy { countryShortNameResolver_ca },
        "ccp" to atomicLazy { countryShortNameResolver_ccp },
        "ce" to atomicLazy { countryShortNameResolver_ce },
        "ceb" to atomicLazy { countryShortNameResolver_ceb },
        "cgg" to atomicLazy { countryShortNameResolver_cgg },
        "chr" to atomicLazy { countryShortNameResolver_chr },
        "ckb" to atomicLazy { countryShortNameResolver_ckb },
        "cs" to atomicLazy { countryShortNameResolver_cs },
        "cu" to atomicLazy { countryShortNameResolver_cu },
        "cy" to atomicLazy { countryShortNameResolver_cy },
        "da" to atomicLazy { countryShortNameResolver_da },
        "dav" to atomicLazy { countryShortNameResolver_dav },
        "de" to atomicLazy { countryShortNameResolver_de },
        "dje" to atomicLazy { countryShortNameResolver_dje },
        "dsb" to atomicLazy { countryShortNameResolver_dsb },
        "dua" to atomicLazy { countryShortNameResolver_dua },
        "dyo" to atomicLazy { countryShortNameResolver_dyo },
        "dz" to atomicLazy { countryShortNameResolver_dz },
        "ebu" to atomicLazy { countryShortNameResolver_ebu },
        "ee" to atomicLazy { countryShortNameResolver_ee },
        "el" to atomicLazy { countryShortNameResolver_el },
        "en" to atomicLazy { countryShortNameResolver_en },
        "eo" to atomicLazy { countryShortNameResolver_eo },
        "es" to atomicLazy { countryShortNameResolver_es },
        "et" to atomicLazy { countryShortNameResolver_et },
        "eu" to atomicLazy { countryShortNameResolver_eu },
        "ewo" to atomicLazy { countryShortNameResolver_ewo },
        "fa" to atomicLazy { countryShortNameResolver_fa },
        "ff" to atomicLazy { countryShortNameResolver_ff },
        "fi" to atomicLazy { countryShortNameResolver_fi },
        "fil" to atomicLazy { countryShortNameResolver_fil },
        "fo" to atomicLazy { countryShortNameResolver_fo },
        "fr" to atomicLazy { countryShortNameResolver_fr },
        "fur" to atomicLazy { countryShortNameResolver_fur },
        "fy" to atomicLazy { countryShortNameResolver_fy },
        "ga" to atomicLazy { countryShortNameResolver_ga },
        "gd" to atomicLazy { countryShortNameResolver_gd },
        "gl" to atomicLazy { countryShortNameResolver_gl },
        "gsw" to atomicLazy { countryShortNameResolver_gsw },
        "gu" to atomicLazy { countryShortNameResolver_gu },
        "guz" to atomicLazy { countryShortNameResolver_guz },
        "gv" to atomicLazy { countryShortNameResolver_gv },
        "ha" to atomicLazy { countryShortNameResolver_ha },
        "haw" to atomicLazy { countryShortNameResolver_haw },
        "he" to atomicLazy { countryShortNameResolver_he },
        "hi" to atomicLazy { countryShortNameResolver_hi },
        "hr" to atomicLazy { countryShortNameResolver_hr },
        "hsb" to atomicLazy { countryShortNameResolver_hsb },
        "hu" to atomicLazy { countryShortNameResolver_hu },
        "hy" to atomicLazy { countryShortNameResolver_hy },
        "ia" to atomicLazy { countryShortNameResolver_ia },
        "id" to atomicLazy { countryShortNameResolver_id },
        "ig" to atomicLazy { countryShortNameResolver_ig },
        "ii" to atomicLazy { countryShortNameResolver_ii },
        "is" to atomicLazy { countryShortNameResolver_is },
        "it" to atomicLazy { countryShortNameResolver_it },
        "ja" to atomicLazy { countryShortNameResolver_ja },
        "jgo" to atomicLazy { countryShortNameResolver_jgo },
        "jmc" to atomicLazy { countryShortNameResolver_jmc },
        "jv" to atomicLazy { countryShortNameResolver_jv },
        "ka" to atomicLazy { countryShortNameResolver_ka },
        "kab" to atomicLazy { countryShortNameResolver_kab },
        "kam" to atomicLazy { countryShortNameResolver_kam },
        "kde" to atomicLazy { countryShortNameResolver_kde },
        "kea" to atomicLazy { countryShortNameResolver_kea },
        "khq" to atomicLazy { countryShortNameResolver_khq },
        "ki" to atomicLazy { countryShortNameResolver_ki },
        "kk" to atomicLazy { countryShortNameResolver_kk },
        "kkj" to atomicLazy { countryShortNameResolver_kkj },
        "kl" to atomicLazy { countryShortNameResolver_kl },
        "kln" to atomicLazy { countryShortNameResolver_kln },
        "km" to atomicLazy { countryShortNameResolver_km },
        "kn" to atomicLazy { countryShortNameResolver_kn },
        "ko" to atomicLazy { countryShortNameResolver_ko },
        "kok" to atomicLazy { countryShortNameResolver_kok },
        "ks" to atomicLazy { countryShortNameResolver_ks },
        "ksb" to atomicLazy { countryShortNameResolver_ksb },
        "ksf" to atomicLazy { countryShortNameResolver_ksf },
        "ksh" to atomicLazy { countryShortNameResolver_ksh },
        "ku" to atomicLazy { countryShortNameResolver_ku },
        "kw" to atomicLazy { countryShortNameResolver_kw },
        "ky" to atomicLazy { countryShortNameResolver_ky },
        "lag" to atomicLazy { countryShortNameResolver_lag },
        "lb" to atomicLazy { countryShortNameResolver_lb },
        "lg" to atomicLazy { countryShortNameResolver_lg },
        "lkt" to atomicLazy { countryShortNameResolver_lkt },
        "ln" to atomicLazy { countryShortNameResolver_ln },
        "lo" to atomicLazy { countryShortNameResolver_lo },
        "lrc" to atomicLazy { countryShortNameResolver_lrc },
        "lt" to atomicLazy { countryShortNameResolver_lt },
        "lu" to atomicLazy { countryShortNameResolver_lu },
        "luo" to atomicLazy { countryShortNameResolver_luo },
        "luy" to atomicLazy { countryShortNameResolver_luy },
        "lv" to atomicLazy { countryShortNameResolver_lv },
        "mai" to atomicLazy { countryShortNameResolver_mai },
        "mas" to atomicLazy { countryShortNameResolver_mas },
        "mer" to atomicLazy { countryShortNameResolver_mer },
        "mfe" to atomicLazy { countryShortNameResolver_mfe },
        "mg" to atomicLazy { countryShortNameResolver_mg },
        "mgh" to atomicLazy { countryShortNameResolver_mgh },
        "mgo" to atomicLazy { countryShortNameResolver_mgo },
        "mi" to atomicLazy { countryShortNameResolver_mi },
        "mk" to atomicLazy { countryShortNameResolver_mk },
        "ml" to atomicLazy { countryShortNameResolver_ml },
        "mn" to atomicLazy { countryShortNameResolver_mn },
        "mni" to atomicLazy { countryShortNameResolver_mni },
        "mr" to atomicLazy { countryShortNameResolver_mr },
        "ms" to atomicLazy { countryShortNameResolver_ms },
        "mt" to atomicLazy { countryShortNameResolver_mt },
        "mua" to atomicLazy { countryShortNameResolver_mua },
        "my" to atomicLazy { countryShortNameResolver_my },
        "mzn" to atomicLazy { countryShortNameResolver_mzn },
        "naq" to atomicLazy { countryShortNameResolver_naq },
        "nb" to atomicLazy { countryShortNameResolver_nb },
        "nd" to atomicLazy { countryShortNameResolver_nd },
        "nds" to atomicLazy { countryShortNameResolver_nds },
        "ne" to atomicLazy { countryShortNameResolver_ne },
        "nl" to atomicLazy { countryShortNameResolver_nl },
        "nmg" to atomicLazy { countryShortNameResolver_nmg },
        "nn" to atomicLazy { countryShortNameResolver_nn },
        "nnh" to atomicLazy { countryShortNameResolver_nnh },
        "nus" to atomicLazy { countryShortNameResolver_nus },
        "nyn" to atomicLazy { countryShortNameResolver_nyn },
        "om" to atomicLazy { countryShortNameResolver_om },
        "or" to atomicLazy { countryShortNameResolver_or },
        "os" to atomicLazy { countryShortNameResolver_os },
        "pa" to atomicLazy { countryShortNameResolver_pa },
        "pcm" to atomicLazy { countryShortNameResolver_pcm },
        "pl" to atomicLazy { countryShortNameResolver_pl },
        "prg" to atomicLazy { countryShortNameResolver_prg },
        "ps" to atomicLazy { countryShortNameResolver_ps },
        "pt" to atomicLazy { countryShortNameResolver_pt },
        "qu" to atomicLazy { countryShortNameResolver_qu },
        "rm" to atomicLazy { countryShortNameResolver_rm },
        "rn" to atomicLazy { countryShortNameResolver_rn },
        "ro" to atomicLazy { countryShortNameResolver_ro },
        "rof" to atomicLazy { countryShortNameResolver_rof },
        "ru" to atomicLazy { countryShortNameResolver_ru },
        "rw" to atomicLazy { countryShortNameResolver_rw },
        "rwk" to atomicLazy { countryShortNameResolver_rwk },
        "sah" to atomicLazy { countryShortNameResolver_sah },
        "saq" to atomicLazy { countryShortNameResolver_saq },
        "sat" to atomicLazy { countryShortNameResolver_sat },
        "sbp" to atomicLazy { countryShortNameResolver_sbp },
        "sd" to atomicLazy { countryShortNameResolver_sd },
        "se" to atomicLazy { countryShortNameResolver_se },
        "seh" to atomicLazy { countryShortNameResolver_seh },
        "ses" to atomicLazy { countryShortNameResolver_ses },
        "sg" to atomicLazy { countryShortNameResolver_sg },
        "shi" to atomicLazy { countryShortNameResolver_shi },
        "si" to atomicLazy { countryShortNameResolver_si },
        "sk" to atomicLazy { countryShortNameResolver_sk },
        "sl" to atomicLazy { countryShortNameResolver_sl },
        "smn" to atomicLazy { countryShortNameResolver_smn },
        "sn" to atomicLazy { countryShortNameResolver_sn },
        "so" to atomicLazy { countryShortNameResolver_so },
        "sq" to atomicLazy { countryShortNameResolver_sq },
        "sr" to atomicLazy { countryShortNameResolver_sr },
        "su" to atomicLazy { countryShortNameResolver_su },
        "sv" to atomicLazy { countryShortNameResolver_sv },
        "sw" to atomicLazy { countryShortNameResolver_sw },
        "ta" to atomicLazy { countryShortNameResolver_ta },
        "te" to atomicLazy { countryShortNameResolver_te },
        "teo" to atomicLazy { countryShortNameResolver_teo },
        "tg" to atomicLazy { countryShortNameResolver_tg },
        "th" to atomicLazy { countryShortNameResolver_th },
        "ti" to atomicLazy { countryShortNameResolver_ti },
        "tk" to atomicLazy { countryShortNameResolver_tk },
        "to" to atomicLazy { countryShortNameResolver_to },
        "tr" to atomicLazy { countryShortNameResolver_tr },
        "tt" to atomicLazy { countryShortNameResolver_tt },
        "twq" to atomicLazy { countryShortNameResolver_twq },
        "tzm" to atomicLazy { countryShortNameResolver_tzm },
        "ug" to atomicLazy { countryShortNameResolver_ug },
        "uk" to atomicLazy { countryShortNameResolver_uk },
        "ur" to atomicLazy { countryShortNameResolver_ur },
        "uz" to atomicLazy { countryShortNameResolver_uz },
        "vai" to atomicLazy { countryShortNameResolver_vai },
        "vi" to atomicLazy { countryShortNameResolver_vi },
        "vo" to atomicLazy { countryShortNameResolver_vo },
        "vun" to atomicLazy { countryShortNameResolver_vun },
        "wae" to atomicLazy { countryShortNameResolver_wae },
        "wo" to atomicLazy { countryShortNameResolver_wo },
        "xh" to atomicLazy { countryShortNameResolver_xh },
        "xog" to atomicLazy { countryShortNameResolver_xog },
        "yav" to atomicLazy { countryShortNameResolver_yav },
        "yi" to atomicLazy { countryShortNameResolver_yi },
        "yo" to atomicLazy { countryShortNameResolver_yo },
        "yue" to atomicLazy { countryShortNameResolver_yue },
        "zgh" to atomicLazy { countryShortNameResolver_zgh },
        "zh" to atomicLazy { countryShortNameResolver_zh },
        "zu" to atomicLazy { countryShortNameResolver_zu },
      )

  override fun resolve(
    key: String,
    language: String?,
    script: String?,
    region: String?,
    variants: List<String>
  ): String? =
      resolversByLanguage[language]?.value?.resolve(key = key, language = language, script = script, region = region, variants = variants)
}