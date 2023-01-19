import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

/**
 * Ein BBergedorf, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author  Torsten Otto
 * @version 10/2022
 */
public class BBergedorf extends Element
{

    /**
     * Erzeuge einen neuen BBergedorf mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public BBergedorf() {
        xPosition = 160;
        yPosition = 80;
        farbe = Color.black;
        orientierung = 0;
        istSichtbar = true;
        breite = 40;
        hoehe  = 40;
        faktorHoehe  = 1;
        faktorBreite = 1;
        figur = gibAktuelleFigur();
    }
    
    /**
     * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
     */
    protected Shape gibAktuelleFigur() {
        // einen GeneralPath definieren
        GeneralPath shape = new GeneralPath();

        //
                ((GeneralPath) shape).moveTo(370.06885, 310.85278);
        ((GeneralPath) shape).lineTo(370.11182, 311.55298);
        ((GeneralPath) shape).curveTo(370.90283, 312.39673, 371.87695, 313.12915, 372.7417, 313.89282);
        ((GeneralPath) shape).curveTo(372.81982, 313.94067, 373.19775, 314.427, 373.1626, 314.46216);
        ((GeneralPath) shape).curveTo(373.33887, 314.5354, 373.9331, 314.71167, 374.01318, 314.74146);
        ((GeneralPath) shape).lineTo(374.22314, 314.46216);
        ((GeneralPath) shape).curveTo(375.25, 314.9607, 376.01562, 315.66284, 376.9917, 316.23267);
        ((GeneralPath) shape).curveTo(378.36914, 317.03687, 379.8335, 317.75024, 381.2417, 318.5022);
        ((GeneralPath) shape).curveTo(381.5249, 318.65308, 382.1128, 318.69507, 382.37354, 318.85278);
        ((GeneralPath) shape).curveTo(382.5205, 318.94165, 383.0381, 319.5598, 383.22314, 319.70142);
        ((GeneralPath) shape).lineTo(387.12354, 322.68286);
        ((GeneralPath) shape).curveTo(387.71582, 323.1355, 388.73047, 323.3601, 389.39307, 323.7522);
        ((GeneralPath) shape).curveTo(390.42725, 324.3645, 391.4331, 325.07742, 392.4419, 325.73267);
        ((GeneralPath) shape).lineTo(392.23193, 326.65164);
        ((GeneralPath) shape).curveTo(392.4585, 326.6365, 393.3423, 326.62576, 393.50342, 326.50223);
        ((GeneralPath) shape).curveTo(393.56445, 325.84207, 393.6211, 325.17947, 393.71338, 324.52274);
        ((GeneralPath) shape).curveTo(396.61084, 323.44412, 399.82715, 323.31473, 402.86182, 322.75223);
        ((GeneralPath) shape).curveTo(405.3994, 319.8577, 408.41895, 317.18484, 411.22314, 314.53152);
        ((GeneralPath) shape).curveTo(411.6499, 314.80887, 413.85742, 320.4495, 414.05322, 320.9114);
        ((GeneralPath) shape).lineTo(413.6333, 321.83133);
        ((GeneralPath) shape).lineTo(413.84326, 322.75223);
        ((GeneralPath) shape).curveTo(414.41504, 322.81668, 414.99463, 322.90164, 415.55322, 323.0413);
        ((GeneralPath) shape).lineTo(415.40186, 323.25125);
        ((GeneralPath) shape).lineTo(414.6919, 323.5227);
        ((GeneralPath) shape).curveTo(414.73975, 323.76343, 414.81787, 324.0027, 414.90186, 324.23267);
        ((GeneralPath) shape).curveTo(417.45654, 325.37183, 417.4375, 325.54617, 419.1626, 327.57156);
        ((GeneralPath) shape).lineTo(418.6626, 331.5413);
        ((GeneralPath) shape).lineTo(420.07178, 331.75223);
        ((GeneralPath) shape).lineTo(420.86182, 333.45145);
        ((GeneralPath) shape).curveTo(420.9912, 333.50076, 421.77686, 333.83572, 421.86182, 333.803);
        ((GeneralPath) shape).curveTo(422.24707, 333.84793, 422.44873, 333.9783, 422.70166, 333.94266);
        ((GeneralPath) shape).lineTo(423.1333, 334.303);
        ((GeneralPath) shape).lineTo(423.1333, 335.15164);
        ((GeneralPath) shape).curveTo(423.13428, 335.512, 422.56494, 335.67703, 422.4917, 335.9329);
        ((GeneralPath) shape).curveTo(422.45605, 336.0579, 422.5005, 336.20142, 422.34326, 336.28152);
        ((GeneralPath) shape).curveTo(422.4077, 336.72974, 422.1626, 337.23123, 422.21338, 337.70142);
        ((GeneralPath) shape).curveTo(422.21338, 337.70142, 421.0044, 339.11206, 420.9331, 339.19263);
        ((GeneralPath) shape).curveTo(420.91553, 339.21265, 420.73828, 339.27466, 420.72314, 339.34302);
        ((GeneralPath) shape).lineTo(419.86182, 339.26294);
        ((GeneralPath) shape).curveTo(419.69727, 339.36206, 419.5786, 339.6643, 419.4419, 339.61157);
        ((GeneralPath) shape).lineTo(418.9419, 339.69263);
        ((GeneralPath) shape).curveTo(418.83887, 339.79224, 418.69385, 339.84985, 418.52197, 339.9729);
        ((GeneralPath) shape).lineTo(418.6626, 340.4729);
        ((GeneralPath) shape).curveTo(418.7666, 340.49976, 418.84033, 340.56323, 418.8833, 340.5315);
        ((GeneralPath) shape).curveTo(418.34912, 341.62378, 418.55225, 342.91187, 418.2417, 343.87134);
        ((GeneralPath) shape).curveTo(418.4038, 343.83032, 419.30322, 343.7229, 419.30322, 343.7229);
        ((GeneralPath) shape).curveTo(419.68164, 343.62036, 420.04004, 343.77466, 420.30322, 343.7229);
        ((GeneralPath) shape).curveTo(420.30322, 343.7229, 420.77783, 344.05542, 420.86182, 344.01294);
        ((GeneralPath) shape).curveTo(420.89795, 344.11548, 420.86182, 344.43286, 420.86182, 344.43286);
        ((GeneralPath) shape).lineTo(420.65186, 345.14282);
        ((GeneralPath) shape).lineTo(420.9331, 345.2815);
        ((GeneralPath) shape).lineTo(421.28174, 345.2229);
        ((GeneralPath) shape).curveTo(421.1372, 345.07837, 422.00635, 345.07837, 421.86182, 345.2229);
        ((GeneralPath) shape).curveTo(421.95508, 345.24976, 422.07178, 345.57153, 422.07178, 345.57153);
        ((GeneralPath) shape).lineTo(421.71338, 345.85278);
        ((GeneralPath) shape).curveTo(421.70215, 345.864, 422.3545, 346.56174, 422.42334, 346.63303);
        ((GeneralPath) shape).curveTo(422.67432, 346.9148, 422.6333, 347.10178, 422.6333, 347.343);
        ((GeneralPath) shape).lineTo(422.57178, 347.55295);
        ((GeneralPath) shape).lineTo(421.86182, 347.5598);
        ((GeneralPath) shape).lineTo(421.64307, 347.843);
        ((GeneralPath) shape).curveTo(422.07373, 347.90744, 422.4834, 347.84836, 422.92334, 347.843);
        ((GeneralPath) shape).curveTo(423.21045, 347.81076, 423.65674, 347.49045, 423.9126, 347.55295);
        ((GeneralPath) shape).curveTo(424.2461, 347.88547, 424.3589, 348.13303, 424.55322, 348.33127);
        ((GeneralPath) shape).curveTo(424.8086, 348.59106, 424.91992, 348.3635, 425.26318, 348.41135);
        ((GeneralPath) shape).curveTo(425.54297, 348.35764, 425.8838, 348.2263, 426.0317, 348.2629);
        ((GeneralPath) shape).curveTo(426.25485, 348.29025, 426.51266, 348.44016, 426.603, 348.55295);
        ((GeneralPath) shape).curveTo(426.64648, 348.53195, 427.66257, 348.83127, 427.66257, 348.83127);
        ((GeneralPath) shape).curveTo(427.66257, 348.83127, 428.06882, 348.06857, 428.16257, 347.843);
        ((GeneralPath) shape).curveTo(428.41113, 347.81174, 430.47946, 346.89474, 430.57175, 346.7815);
        ((GeneralPath) shape).lineTo(431.353, 346.7014);
        ((GeneralPath) shape).lineTo(432.06296, 346.91135);
        ((GeneralPath) shape).curveTo(432.23193, 346.96262, 433.12354, 347.41135, 433.12354, 347.41135);
        ((GeneralPath) shape).lineTo(434.39304, 347.7014);
        ((GeneralPath) shape).curveTo(434.2109, 349.97485, 432.53513, 355.7478, 432.70163, 356.55295);
        ((GeneralPath) shape).curveTo(432.70163, 356.55295, 432.9033, 357.31516, 433.0532, 357.41135);
        ((GeneralPath) shape).curveTo(432.9609, 357.58224, 433.4443, 357.89282, 433.6235, 357.89282);
        ((GeneralPath) shape).curveTo(434.16745, 357.89282, 434.69724, 357.86548, 435.24167, 357.8313);
        ((GeneralPath) shape).curveTo(435.4448, 358.4729, 436.16013, 366.6814, 436.103, 367.46216);
        ((GeneralPath) shape).curveTo(438.73288, 368.53394, 442.20993, 369.8064, 444.89304, 370.73267);
        ((GeneralPath) shape).curveTo(445.61374, 372.04224, 447.13766, 373.5027, 448.08347, 374.69263);
        ((GeneralPath) shape).curveTo(448.08347, 374.69263, 448.63718, 374.4485, 448.79343, 374.42212);
        ((GeneralPath) shape).curveTo(449.21872, 374.35083, 449.60886, 374.34302, 450.06296, 374.34302);
        ((GeneralPath) shape).curveTo(450.06296, 374.34302, 450.30222, 373.76782, 450.27194, 373.71216);
        ((GeneralPath) shape).curveTo(450.29343, 373.56226, 451.15964, 373.2273, 451.4819, 373.2727);
        ((GeneralPath) shape).curveTo(451.76755, 373.28198, 452.71774, 374.16235, 452.89304, 374.2727);
        ((GeneralPath) shape).curveTo(453.17722, 374.45142, 454.81296, 375.12134, 454.81296, 375.12134);
        ((GeneralPath) shape).lineTo(453.46335, 376.19263);
        ((GeneralPath) shape).lineTo(455.16257, 379.23267);
        ((GeneralPath) shape).curveTo(456.02, 378.90015, 458.11423, 378.26392, 458.77194, 377.74146);
        ((GeneralPath) shape).lineTo(459.56296, 379.94263);
        ((GeneralPath) shape).lineTo(460.5532, 380.36157);
        ((GeneralPath) shape).curveTo(459.9526, 382.427, 459.54684, 384.51, 459.06296, 386.60278);
        ((GeneralPath) shape).curveTo(461.0239, 386.72388, 463.97507, 388.37573, 465.44186, 389.57153);
        ((GeneralPath) shape).curveTo(464.60886, 390.91333, 463.9028, 392.36304, 463.1733, 393.76294);
        ((GeneralPath) shape).curveTo(463.1943, 393.8059, 464.52194, 394.4729, 464.52194, 394.4729);
        ((GeneralPath) shape).curveTo(464.74362, 394.52563, 465.3032, 394.9729, 465.3032, 394.9729);
        ((GeneralPath) shape).lineTo(466.5034, 395.5315);
        ((GeneralPath) shape).curveTo(466.69482, 395.7351, 466.89597, 395.79956, 467.07175, 396.0315);
        ((GeneralPath) shape).curveTo(467.02197, 396.11255, 467.57175, 396.45142, 467.57175, 396.45142);
        ((GeneralPath) shape).lineTo(467.7817, 396.45142);
        ((GeneralPath) shape).lineTo(470.47314, 398.64282);
        ((GeneralPath) shape).curveTo(470.47314, 398.64282, 471.77832, 399.43384, 471.8833, 399.5022);
        ((GeneralPath) shape).curveTo(472.20068, 399.7766, 472.55615, 399.91626, 472.813, 400.20142);
        ((GeneralPath) shape).curveTo(473.0161, 400.36743, 474.00098, 401.4768, 474.09326, 401.55298);
        ((GeneralPath) shape).curveTo(474.07516, 401.62036, 474.5005, 402.24487, 474.59326, 402.41138);
        ((GeneralPath) shape).lineTo(475.65182, 401.20142);
        ((GeneralPath) shape).curveTo(475.81494, 401.61108, 477.20016, 402.5398, 477.2817, 402.62134);
        ((GeneralPath) shape).curveTo(477.49802, 402.71606, 478.0923, 403.33374, 478.0532, 403.4729);
        ((GeneralPath) shape).curveTo(478.14694, 403.52417, 478.64352, 404.04517, 478.69186, 404.18286);
        ((GeneralPath) shape).curveTo(478.89108, 404.27075, 480.15134, 405.17358, 480.18307, 405.16138);
        ((GeneralPath) shape).curveTo(480.28268, 405.2527, 480.9653, 405.9148, 481.1733, 406.0813);
        ((GeneralPath) shape).curveTo(483.499, 407.93774, 483.3071, 409.4358, 486.20163, 410.69263);
        ((GeneralPath) shape).curveTo(487.4814, 411.2478, 486.75534, 410.41968, 488.1235, 411.62134);
        ((GeneralPath) shape).curveTo(488.3535, 411.823, 488.5405, 411.95825, 488.68307, 412.25122);
        ((GeneralPath) shape).lineTo(484.93307, 415.73267);
        ((GeneralPath) shape).curveTo(485.42282, 416.1394, 485.50485, 416.77173, 485.99167, 417.21216);
        ((GeneralPath) shape).curveTo(486.5234, 417.6931, 487.1743, 418.06616, 487.5532, 418.71216);
        ((GeneralPath) shape).curveTo(487.58737, 418.77026, 487.60202, 418.85815, 487.6235, 418.92212);
        ((GeneralPath) shape).curveTo(487.8276, 419.35522, 489.55856, 422.3069, 489.4731, 422.5315);
        ((GeneralPath) shape).lineTo(491.24167, 424.0227);
        ((GeneralPath) shape).curveTo(492.24704, 424.07935, 493.08884, 423.89624, 493.93307, 423.88306);
        ((GeneralPath) shape).curveTo(494.4941, 423.87427, 494.95993, 423.97192, 495.49167, 424.0227);
        ((GeneralPath) shape).curveTo(496.03268, 424.07397, 496.63376, 423.94263, 497.19186, 423.94263);
        ((GeneralPath) shape).curveTo(497.48337, 423.67163, 498.0742, 423.4226, 498.1235, 423.09302);
        ((GeneralPath) shape).curveTo(498.77975, 418.7024, 499.44333, 414.31274, 500.02194, 409.91138);
        ((GeneralPath) shape).curveTo(500.31296, 409.91138, 503.6489, 409.89282, 503.71335, 409.91138);
        ((GeneralPath) shape).curveTo(505.3779, 410.39575, 509.69968, 412.47778, 511.5034, 413.25122);
        ((GeneralPath) shape).curveTo(509.14255, 416.88354, 506.70407, 420.45142, 504.353, 424.09302);
        ((GeneralPath) shape).curveTo(503.8447, 424.88013, 502.9277, 425.85815, 502.5825, 426.71216);
        ((GeneralPath) shape).curveTo(502.55563, 426.77856, 502.45065, 427.65503, 502.43307, 427.7815);
        ((GeneralPath) shape).curveTo(503.98825, 428.42163, 505.27878, 429.52905, 506.54343, 430.61157);
        ((GeneralPath) shape).curveTo(505.90475, 431.3977, 505.42575, 433.00415, 505.56296, 434.01294);
        ((GeneralPath) shape).curveTo(503.97458, 434.00952, 497.27048, 434.12085, 496.34323, 435.36157);
        ((GeneralPath) shape).lineTo(496.70163, 436.56274);
        ((GeneralPath) shape).curveTo(496.70163, 436.56274, 495.49704, 436.96167, 495.2817, 437.05298);
        ((GeneralPath) shape).curveTo(493.07272, 437.98853, 491.74167, 439.1848, 490.0317, 440.81274);
        ((GeneralPath) shape).curveTo(488.17282, 442.58228, 486.0991, 444.53052, 483.8032, 445.70142);
        ((GeneralPath) shape).curveTo(483.3657, 445.92456, 482.92526, 446.14185, 482.51315, 446.41138);
        ((GeneralPath) shape).curveTo(479.0107, 449.02808, 475.30173, 450.92163, 471.18307, 452.43286);
        ((GeneralPath) shape).curveTo(470.9238, 452.52808, 464.92575, 455.2483, 462.04343, 456.2727);
        ((GeneralPath) shape).curveTo(461.05173, 456.62524, 460.16013, 457.0188, 459.21335, 457.4729);
        ((GeneralPath) shape).curveTo(454.44528, 459.76, 453.17575, 460.9817, 450.77194, 465.69263);
        ((GeneralPath) shape).curveTo(450.35837, 466.50366, 450.02585, 467.34155, 449.643, 468.17212);
        ((GeneralPath) shape).curveTo(447.90082, 471.95435, 446.46088, 476.02466, 445.15768, 479.97827);
        ((GeneralPath) shape).curveTo(444.73825, 481.25073, 444.40768, 482.57153, 443.96332, 483.8313);
        ((GeneralPath) shape).curveTo(442.06586, 489.2141, 437.4975, 492.91528, 431.7016, 492.9729);
        ((GeneralPath) shape).curveTo(430.66644, 492.98315, 429.62885, 492.9817, 428.5932, 492.9729);
        ((GeneralPath) shape).curveTo(423.1347, 492.927, 417.66986, 491.12915, 412.37054, 489.9851);
        ((GeneralPath) shape).curveTo(410.13763, 489.5027, 407.95062, 489.22876, 405.69183, 488.93286);
        ((GeneralPath) shape).curveTo(405.15375, 488.86255, 404.6093, 488.7229, 404.06293, 488.7229);
        ((GeneralPath) shape).curveTo(400.8344, 488.7229, 397.6059, 490.2151, 394.50336, 490.99146);
        ((GeneralPath) shape).curveTo(390.28754, 492.04614, 387.0805, 492.53442, 382.73187, 491.34302);
        ((GeneralPath) shape).curveTo(377.20746, 489.82935, 372.89935, 485.9978, 368.92572, 482.06665);
        ((GeneralPath) shape).curveTo(368.16498, 481.31372, 367.247, 480.5437, 366.57172, 479.7229);
        ((GeneralPath) shape).curveTo(364.66986, 477.4104, 362.98676, 474.6223, 361.61176, 471.92212);
        ((GeneralPath) shape).curveTo(359.3481, 467.47632, 357.4785, 462.74, 353.96332, 459.10278);
        ((GeneralPath) shape).curveTo(351.21432, 456.25803, 350.07416, 454.94116, 346.16254, 453.71216);
        ((GeneralPath) shape).curveTo(344.59662, 453.21997, 342.6308, 453.38354, 340.9819, 453.35278);
        ((GeneralPath) shape).curveTo(337.4975, 453.28833, 334.12448, 452.593, 330.78168, 451.66135);
        ((GeneralPath) shape).curveTo(328.47992, 451.01974, 327.4179, 450.90256, 325.60297, 449.18283);
        ((GeneralPath) shape).curveTo(325.0273, 448.63742, 324.48676, 448.0168, 323.9731, 447.41135);
        ((GeneralPath) shape).curveTo(320.81247, 443.68674, 318.7021, 437.34055, 316.99557, 432.7546);
        ((GeneralPath) shape).curveTo(316.48825, 431.39084, 316.01852, 429.83224, 315.33344, 428.55295);
        ((GeneralPath) shape).curveTo(315.03168, 427.989, 314.62836, 427.3889, 314.26315, 426.86154);
        ((GeneralPath) shape).curveTo(312.9448, 424.95578, 302.07126, 412.1677, 300.91208, 411.3425);
        ((GeneralPath) shape).curveTo(299.55417, 410.14474, 297.22507, 408.6672, 295.63327, 407.5012);
        ((GeneralPath) shape).curveTo(294.63376, 406.76877, 293.71432, 406.15842, 292.8403, 405.2551);
        ((GeneralPath) shape).curveTo(289.57663, 401.8806, 286.96628, 395.86838, 286.4819, 391.2014);
        ((GeneralPath) shape).curveTo(286.4487, 390.8796, 286.4482, 390.54858, 286.41254, 390.22287);
        ((GeneralPath) shape).curveTo(285.63422, 383.04367, 286.29684, 379.54562, 281.9516, 373.21213);
        ((GeneralPath) shape).lineTo(280.60297, 371.23264);
        ((GeneralPath) shape).curveTo(276.19427, 364.78098, 276.35004, 363.96848, 275.99164, 356.2727);
        ((GeneralPath) shape).curveTo(275.95502, 355.489, 275.9101, 354.71457, 275.85297, 353.93286);
        ((GeneralPath) shape).curveTo(275.4301, 348.13596, 278.88324, 342.5061, 280.81293, 337.21216);
        ((GeneralPath) shape).curveTo(281.01996, 336.6443, 281.25336, 336.11353, 281.5219, 335.57153);
        ((GeneralPath) shape).lineTo(282.87347, 336.00122);
        ((GeneralPath) shape).curveTo(283.3886, 339.51196, 286.38324, 343.00415, 289.5434, 344.7815);
        ((GeneralPath) shape).curveTo(289.89398, 343.7102, 292.0893, 337.37036, 292.08344, 337.34302);
        ((GeneralPath) shape).curveTo(291.7187, 335.61694, 290.5976, 331.37036, 290.81293, 329.19263);
        ((GeneralPath) shape).lineTo(294.42328, 328.84302);
        ((GeneralPath) shape).curveTo(294.26117, 327.72778, 294.12592, 326.53052, 293.85297, 325.44263);
        ((GeneralPath) shape).curveTo(293.57367, 324.3274, 288.123, 319.13354, 287.62347, 318.64282);
        ((GeneralPath) shape).lineTo(287.06293, 310.06274);
        ((GeneralPath) shape).lineTo(286.56293, 309.57153);
        ((GeneralPath) shape).lineTo(287.5434, 308.7229);
        ((GeneralPath) shape).lineTo(289.393, 309.00122);
        ((GeneralPath) shape).lineTo(289.25336, 310.20142);
        ((GeneralPath) shape).lineTo(302.71332, 323.67212);
        ((GeneralPath) shape).curveTo(304.40912, 325.3689, 306.0063, 327.14087, 307.88324, 328.63306);
        ((GeneralPath) shape).curveTo(308.1347, 328.57446, 308.41498, 328.5398, 308.67328, 328.56274);
        ((GeneralPath) shape).curveTo(309.12738, 327.9431, 309.1679, 327.12183, 309.5932, 326.5022);
        ((GeneralPath) shape).curveTo(309.92572, 326.0183, 311.59467, 324.64722, 311.51312, 324.10278);
        ((GeneralPath) shape).lineTo(311.01312, 323.81274);
        ((GeneralPath) shape).curveTo(311.4687, 322.96265, 312.37347, 322.0818, 312.99164, 321.3313);
        ((GeneralPath) shape).lineTo(313.28168, 321.48267);
        ((GeneralPath) shape).curveTo(314.41156, 319.95142, 314.99896, 318.9729, 316.53168, 317.79126);
        ((GeneralPath) shape).lineTo(316.96332, 317.5813);
        ((GeneralPath) shape).curveTo(317.0893, 317.6277, 317.54388, 317.4192, 317.67328, 317.37134);
        ((GeneralPath) shape).lineTo(323.83344, 309.7815);
        ((GeneralPath) shape).curveTo(324.07465, 309.48462, 324.34662, 308.9392, 324.6225, 308.5813);
        ((GeneralPath) shape).lineTo(325.53168, 308.29126);
        ((GeneralPath) shape).lineTo(325.53168, 307.37134);
        ((GeneralPath) shape).lineTo(326.66254, 307.37134);
        ((GeneralPath) shape).curveTo(326.5595, 307.4724, 326.66254, 308.43286, 326.66254, 308.43286);
        ((GeneralPath) shape).curveTo(326.72064, 308.37427, 327.10297, 309.00122, 327.10297, 309.00122);
        ((GeneralPath) shape).curveTo(327.0688, 309.08228, 327.52826, 309.3982, 327.5932, 309.43286);
        ((GeneralPath) shape).curveTo(327.9135, 309.60376, 328.24408, 309.8098, 328.72308, 309.99146);
        ((GeneralPath) shape).curveTo(328.84564, 309.96118, 330.28168, 310.49146, 330.28168, 310.49146);
        ((GeneralPath) shape).curveTo(330.5605, 310.4314, 330.88715, 310.67798, 331.2016, 310.85278);
        ((GeneralPath) shape).curveTo(331.36176, 310.90112, 332.1225, 311.41138, 332.1225, 311.41138);
        ((GeneralPath) shape).lineTo(332.7016, 312.19263);
        ((GeneralPath) shape).curveTo(332.67767, 312.22046, 333.67767, 312.98267, 333.76312, 313.04126);
        ((GeneralPath) shape).curveTo(333.8427, 312.99243, 334.84662, 314.08862, 334.96332, 314.0315);
        ((GeneralPath) shape).curveTo(335.3349, 314.7649, 336.09222, 315.3464, 336.5219, 316.08127);
        ((GeneralPath) shape).curveTo(336.90277, 315.7424, 341.31195, 311.16086, 341.48187, 310.6428);
        ((GeneralPath) shape).curveTo(341.48187, 310.6428, 341.92374, 310.24484, 342.19183, 310.0627);
        ((GeneralPath) shape).curveTo(342.3261, 310.09592, 342.64203, 309.93478, 342.75333, 309.85275);
        ((GeneralPath) shape).curveTo(343.12003, 309.9138, 343.52435, 309.65256, 343.9633, 309.6428);
        ((GeneralPath) shape).curveTo(344.14886, 309.66623, 344.4335, 309.64914, 344.75333, 309.50217);
        ((GeneralPath) shape).lineTo(345.3832, 308.86157);
        ((GeneralPath) shape).curveTo(345.93204, 308.02954, 346.49063, 307.13354, 347.15176, 306.38303);
        ((GeneralPath) shape).lineTo(348.0717, 306.16135);
        ((GeneralPath) shape).curveTo(348.45938, 306.37082, 351.48624, 308.0222, 351.61172, 308.22287);
        ((GeneralPath) shape).curveTo(351.99307, 308.27902, 353.34415, 309.4128, 353.4633, 309.35275);
        ((GeneralPath) shape).curveTo(353.76602, 309.7424, 354.50772, 310.1096, 354.9418, 310.35275);
        ((GeneralPath) shape).curveTo(357.48184, 311.77463, 359.6957, 313.66672, 362.11172, 315.3127);
        ((GeneralPath) shape).curveTo(362.34952, 315.47433, 363.329, 316.33176, 363.53165, 316.3713);
        ((GeneralPath) shape).lineTo(364.09317, 315.60275);
        ((GeneralPath) shape).curveTo(364.34952, 315.79514, 364.61856, 316.01974, 364.9418, 316.08127);
        ((GeneralPath) shape).lineTo(367.42325, 312.2629);
        ((GeneralPath) shape).lineTo(367.14297, 311.1213);
        ((GeneralPath) shape).lineTo(370.06885, 310.85278);
        ((GeneralPath) shape).closePath();
        
        // transformieren:
        Shape newShape = transformiere(shape);
        return  newShape;
    }

}
