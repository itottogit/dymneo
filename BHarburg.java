import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

/**
 * Ein BHarburg, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author  Torsten Otto
 * @version 10/2022
 */
public class BHarburg extends Element
{

    /**
     * Erzeuge einen neuen BHarburg mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public BHarburg() {
        xPosition = 160;
        yPosition = 80;
        farbe = Color.blue;
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
                ((GeneralPath) shape).moveTo(276.7798, 396.74146);
        ((GeneralPath) shape).lineTo(275.22314, 397.87134);
        ((GeneralPath) shape).curveTo(275.10205, 398.57544, 274.1875, 400.23364, 274.1626, 400.35278);
        ((GeneralPath) shape).curveTo(273.89746, 400.50708, 273.65674, 400.74292, 273.37354, 400.91138);
        ((GeneralPath) shape).curveTo(273.14453, 400.82446, 272.45312, 401.14282, 272.2417, 401.34302);
        ((GeneralPath) shape).lineTo(272.10303, 402.19263);
        ((GeneralPath) shape).lineTo(271.45166, 403.82153);
        ((GeneralPath) shape).curveTo(271.208, 403.79468, 270.917, 403.65454, 270.6831, 403.68286);
        ((GeneralPath) shape).curveTo(270.4834, 403.91235, 270.0747, 404.0813, 269.97314, 404.39282);
        ((GeneralPath) shape).curveTo(269.67773, 405.2976, 268.54248, 407.83228, 269.12354, 408.71216);
        ((GeneralPath) shape).lineTo(270.6831, 409.7727);
        ((GeneralPath) shape).lineTo(268.27197, 414.5227);
        ((GeneralPath) shape).lineTo(274.9331, 416.9329);
        ((GeneralPath) shape).lineTo(271.60303, 421.82156);
        ((GeneralPath) shape).lineTo(270.89307, 421.19263);
        ((GeneralPath) shape).lineTo(270.39307, 421.82156);
        ((GeneralPath) shape).lineTo(269.4126, 421.40164);
        ((GeneralPath) shape).lineTo(268.84326, 422.32156);
        ((GeneralPath) shape).lineTo(265.01318, 422.38306);
        ((GeneralPath) shape).lineTo(265.65186, 421.25122);
        ((GeneralPath) shape).lineTo(265.0835, 420.9016);
        ((GeneralPath) shape).lineTo(264.6626, 421.67212);
        ((GeneralPath) shape).lineTo(264.09326, 421.46216);
        ((GeneralPath) shape).lineTo(264.6626, 420.54126);
        ((GeneralPath) shape).lineTo(263.45166, 420.61157);
        ((GeneralPath) shape).curveTo(262.36523, 422.1809, 261.4756, 423.7776, 260.55322, 425.44263);
        ((GeneralPath) shape).curveTo(258.1499, 424.85034, 255.45213, 424.38403, 253.4619, 422.96216);
        ((GeneralPath) shape).lineTo(253.59227, 421.82153);
        ((GeneralPath) shape).curveTo(253.36229, 421.7478, 252.39207, 420.78882, 251.97215, 420.61157);
        ((GeneralPath) shape).curveTo(249.85594, 423.29272, 247.74998, 425.9851, 245.59227, 428.63306);
        ((GeneralPath) shape).lineTo(245.59227, 428.84302);
        ((GeneralPath) shape).curveTo(245.59227, 428.84302, 246.20262, 429.14673, 246.23192, 429.12134);
        ((GeneralPath) shape).curveTo(246.312, 429.27368, 246.94823, 429.96997, 247.01219, 430.05298);
        ((GeneralPath) shape).curveTo(247.09715, 430.01733, 249.34227, 430.75122, 249.34227, 430.75122);
        ((GeneralPath) shape).curveTo(249.50877, 430.7771, 250.63231, 431.5315, 250.63231, 431.5315);
        ((GeneralPath) shape).curveTo(250.80956, 431.48462, 253.24315, 432.95142, 253.24315, 432.95142);
        ((GeneralPath) shape).curveTo(253.63377, 433.3728, 254.30614, 433.4607, 254.59227, 433.80298);
        ((GeneralPath) shape).curveTo(254.66502, 433.76733, 255.09227, 434.1516, 255.09227, 434.1516);
        ((GeneralPath) shape).curveTo(255.87352, 435.28833, 257.58298, 437.5764, 258.07224, 438.62134);
        ((GeneralPath) shape).lineTo(252.9619, 442.87134);
        ((GeneralPath) shape).curveTo(252.55418, 443.2102, 252.18065, 443.86694, 251.76219, 444.2815);
        ((GeneralPath) shape).curveTo(251.7705, 444.30737, 251.63182, 444.81763, 251.61229, 444.85278);
        ((GeneralPath) shape).curveTo(251.41454, 445.0569, 251.32518, 445.1604, 251.26219, 445.2815);
        ((GeneralPath) shape).curveTo(250.08202, 445.85718, 249.90916, 445.70483, 248.42235, 445.7727);
        ((GeneralPath) shape).lineTo(249.28319, 446.98267);
        ((GeneralPath) shape).lineTo(248.2119, 447.62134);
        ((GeneralPath) shape).lineTo(247.57323, 446.8313);
        ((GeneralPath) shape).lineTo(246.583, 447.3313);
        ((GeneralPath) shape).lineTo(246.37305, 446.98267);
        ((GeneralPath) shape).curveTo(245.17773, 447.55542, 243.67332, 447.86206, 242.40186, 448.26294);
        ((GeneralPath) shape).lineTo(241.48193, 446.70142);
        ((GeneralPath) shape).curveTo(240.9253, 447.0227, 240.22508, 447.55444, 239.56201, 447.4729);
        ((GeneralPath) shape).curveTo(238.88428, 448.50708, 237.88965, 449.38306, 237.08301, 450.31274);
        ((GeneralPath) shape).curveTo(236.01172, 451.54758, 235.0503, 452.85715, 234.04297, 454.14282);
        ((GeneralPath) shape).curveTo(232.79932, 453.23755, 231.52539, 452.3684, 230.35205, 451.37134);
        ((GeneralPath) shape).curveTo(229.11328, 454.31177, 228.33838, 457.45972, 227.45312, 460.5227);
        ((GeneralPath) shape).lineTo(227.37305, 460.87134);
        ((GeneralPath) shape).curveTo(226.01855, 460.5183, 224.6543, 460.17163, 223.333, 459.73267);
        ((GeneralPath) shape).lineTo(223.12305, 461.44263);
        ((GeneralPath) shape).lineTo(222.35303, 461.50122);
        ((GeneralPath) shape).curveTo(222.32127, 462.59106, 221.9995, 463.33224, 222.41309, 464.42212);
        ((GeneralPath) shape).lineTo(221.14307, 464.2727);
        ((GeneralPath) shape).lineTo(220.9331, 465.12134);
        ((GeneralPath) shape).lineTo(220.4331, 465.54126);
        ((GeneralPath) shape).lineTo(220.29295, 466.54126);
        ((GeneralPath) shape).curveTo(219.7949, 466.57007, 219.29053, 466.64526, 218.8032, 466.75122);
        ((GeneralPath) shape).lineTo(219.3032, 468.31274);
        ((GeneralPath) shape).lineTo(218.24315, 468.31274);
        ((GeneralPath) shape).lineTo(217.60301, 468.46213);
        ((GeneralPath) shape).curveTo(217.43114, 468.42944, 216.92625, 468.95676, 216.89305, 468.9426);
        ((GeneralPath) shape).curveTo(216.4121, 468.96655, 214.05174, 469.41965, 213.49315, 469.593);
        ((GeneralPath) shape).curveTo(213.5576, 469.0212, 213.291, 468.47238, 213.34325, 467.88303);
        ((GeneralPath) shape).curveTo(213.333, 467.37866, 213.10448, 466.8274, 213.06297, 466.40158);
        ((GeneralPath) shape).curveTo(212.98145, 465.56613, 212.99316, 464.7014, 212.99316, 463.85275);
        ((GeneralPath) shape).lineTo(212.56297, 463.63303);
        ((GeneralPath) shape).curveTo(212.64307, 462.89474, 212.56297, 462.3171, 212.56297, 461.65158);
        ((GeneralPath) shape).curveTo(212.56297, 461.65158, 212.021, 461.32785, 211.99316, 461.29123);
        ((GeneralPath) shape).curveTo(211.98193, 461.03683, 211.82227, 460.67307, 211.85303, 460.3713);
        ((GeneralPath) shape).lineTo(211.99316, 459.88303);
        ((GeneralPath) shape).curveTo(212.04881, 459.7629, 212.6206, 459.0002, 212.56297, 458.8928);
        ((GeneralPath) shape).lineTo(212.64307, 458.54123);
        ((GeneralPath) shape).curveTo(212.41895, 458.3005, 212.13232, 458.21066, 211.85303, 458.10275);
        ((GeneralPath) shape).lineTo(211.85303, 458.96213);
        ((GeneralPath) shape).curveTo(211.85303, 458.96213, 211.45457, 459.719, 211.50195, 459.81274);
        ((GeneralPath) shape).lineTo(209.87305, 458.96213);
        ((GeneralPath) shape).lineTo(209.01318, 459.38303);
        ((GeneralPath) shape).curveTo(208.19482, 458.4978, 207.21484, 457.78586, 206.40234, 456.90158);
        ((GeneralPath) shape).lineTo(206.1831, 455.48264);
        ((GeneralPath) shape).curveTo(205.03809, 455.65598, 203.86523, 455.717, 202.71191, 455.83127);
        ((GeneralPath) shape).lineTo(202.64307, 455.27267);
        ((GeneralPath) shape).lineTo(202.2832, 455.0627);
        ((GeneralPath) shape).lineTo(202.01318, 455.6213);
        ((GeneralPath) shape).lineTo(201.22314, 455.35275);
        ((GeneralPath) shape).lineTo(201.15234, 454.21213);
        ((GeneralPath) shape).lineTo(199.38232, 453.85275);
        ((GeneralPath) shape).curveTo(199.29932, 453.00266, 199.28418, 452.08273, 199.38232, 451.23264);
        ((GeneralPath) shape).curveTo(198.99414, 451.12424, 197.8003, 450.40256, 197.54295, 450.3928);
        ((GeneralPath) shape).curveTo(195.20995, 450.30197, 192.85545, 450.10666, 190.52196, 450.16135);
        ((GeneralPath) shape).lineTo(189.38231, 448.8215);
        ((GeneralPath) shape).curveTo(188.60545, 448.5798, 185.54442, 447.97385, 185.13231, 447.68283);
        ((GeneralPath) shape).lineTo(184.29295, 449.10275);
        ((GeneralPath) shape).lineTo(187.61229, 451.3713);
        ((GeneralPath) shape).curveTo(186.78954, 453.89035, 185.04637, 457.11496, 183.93309, 459.52267);
        ((GeneralPath) shape).curveTo(181.45409, 459.4089, 174.65916, 459.05637, 173.73192, 459.10275);
        ((GeneralPath) shape).curveTo(173.65477, 459.7639, 173.56395, 460.42648, 173.44188, 461.08127);
        ((GeneralPath) shape).lineTo(171.25194, 460.58127);
        ((GeneralPath) shape).lineTo(169.26317, 462.29123);
        ((GeneralPath) shape).lineTo(168.91307, 462.21213);
        ((GeneralPath) shape).curveTo(168.25926, 463.4675, 164.43211, 467.29123, 163.16307, 468.593);
        ((GeneralPath) shape).curveTo(162.94286, 468.81906, 162.562, 469.12668, 162.39305, 469.38303);
        ((GeneralPath) shape).curveTo(162.35692, 469.43823, 162.2119, 469.98557, 162.18309, 470.08127);
        ((GeneralPath) shape).curveTo(160.94969, 469.48752, 159.31639, 469.20285, 157.99315, 468.81274);
        ((GeneralPath) shape).curveTo(157.70702, 469.1692, 157.60057, 469.87424, 157.35301, 470.30295);
        ((GeneralPath) shape).lineTo(156.8037, 470.09494);
        ((GeneralPath) shape).curveTo(157.0991, 469.822, 157.18748, 469.1003, 157.44383, 468.75607);
        ((GeneralPath) shape).lineTo(153.38231, 467.46213);
        ((GeneralPath) shape).curveTo(154.1035, 464.25363, 155.895, 459.99826, 158.49315, 457.8928);
        ((GeneralPath) shape).lineTo(158.70311, 456.7629);
        ((GeneralPath) shape).curveTo(159.46288, 455.95724, 160.40672, 454.96164, 161.39305, 454.4221);
        ((GeneralPath) shape).curveTo(161.4033, 454.19797, 161.07079, 453.3337, 160.89305, 453.29123);
        ((GeneralPath) shape).lineTo(160.833, 452.8713);
        ((GeneralPath) shape).curveTo(160.833, 452.8713, 161.4121, 451.84396, 161.47313, 451.73264);
        ((GeneralPath) shape).lineTo(159.62303, 447.1213);
        ((GeneralPath) shape).curveTo(160.82567, 445.53976, 164.63182, 441.0002, 164.66307, 440.9514);
        ((GeneralPath) shape).curveTo(164.79637, 440.74387, 164.91014, 440.33273, 164.87303, 440.10275);
        ((GeneralPath) shape).curveTo(164.82664, 439.86398, 164.70067, 439.6794, 164.72313, 439.61154);
        ((GeneralPath) shape).curveTo(165.00536, 439.07346, 165.8828, 438.02658, 166.56297, 437.97287);
        ((GeneralPath) shape).lineTo(165.22313, 435.71213);
        ((GeneralPath) shape).curveTo(165.11766, 435.5378, 163.9663, 433.70285, 163.95311, 433.65158);
        ((GeneralPath) shape).curveTo(163.6162, 432.33127, 163.65184, 430.43527, 163.52196, 429.05295);
        ((GeneralPath) shape).lineTo(162.18309, 429.47287);
        ((GeneralPath) shape).lineTo(161.60301, 428.343);
        ((GeneralPath) shape).lineTo(162.10301, 426.7815);
        ((GeneralPath) shape).curveTo(162.15135, 426.6213, 162.20213, 426.05542, 162.31297, 426.1516);
        ((GeneralPath) shape).lineTo(162.31297, 425.93286);
        ((GeneralPath) shape).curveTo(162.3745, 425.50903, 161.66063, 424.46265, 161.74315, 423.80298);
        ((GeneralPath) shape).curveTo(161.79295, 423.05884, 161.04686, 422.60278, 160.833, 422.0315);
        ((GeneralPath) shape).curveTo(160.75829, 422.00757, 158.93895, 420.31128, 158.70311, 420.19263);
        ((GeneralPath) shape).lineTo(157.57323, 419.9016);
        ((GeneralPath) shape).curveTo(157.49998, 419.85962, 156.86229, 419.19263, 156.86229, 419.19263);
        ((GeneralPath) shape).lineTo(156.72313, 418.13306);
        ((GeneralPath) shape).curveTo(156.72313, 418.13306, 155.36766, 415.62036, 155.44188, 415.23267);
        ((GeneralPath) shape).curveTo(155.38524, 415.2024, 154.45311, 414.31274, 154.45311, 414.31274);
        ((GeneralPath) shape).lineTo(154.24315, 413.60278);
        ((GeneralPath) shape).curveTo(154.17674, 413.4978, 153.68846, 413.18774, 153.60301, 413.04126);
        ((GeneralPath) shape).lineTo(152.74315, 412.82153);
        ((GeneralPath) shape).lineTo(152.53319, 412.68286);
        ((GeneralPath) shape).lineTo(150.90184, 410.2727);
        ((GeneralPath) shape).curveTo(150.96971, 409.85522, 150.6953, 408.9026, 150.69188, 408.35278);
        ((GeneralPath) shape).curveTo(150.59618, 408.5686, 150.18553, 409.46216, 149.76317, 409.70142);
        ((GeneralPath) shape).lineTo(149.5532, 409.7727);
        ((GeneralPath) shape).curveTo(149.29198, 409.82593, 148.9995, 409.56274, 148.70311, 409.56274);
        ((GeneralPath) shape).curveTo(148.49608, 409.56274, 148.28075, 409.65942, 148.07323, 409.63306);
        ((GeneralPath) shape).lineTo(148.07323, 408.35278);
        ((GeneralPath) shape).lineTo(147.78319, 407.93286);
        ((GeneralPath) shape).lineTo(147.28319, 407.86157);
        ((GeneralPath) shape).curveTo(146.75389, 407.86792, 146.72508, 407.6936, 146.57323, 407.5813);
        ((GeneralPath) shape).curveTo(146.54979, 407.4348, 146.15184, 406.87134, 146.15184, 406.87134);
        ((GeneralPath) shape).curveTo(145.7827, 407.37866, 145.55565, 408.9392, 145.94188, 409.42212);
        ((GeneralPath) shape).curveTo(145.85204, 409.69556, 145.31834, 411.13403, 145.38329, 411.3313);
        ((GeneralPath) shape).lineTo(146.86229, 412.3313);
        ((GeneralPath) shape).curveTo(146.40233, 412.26147, 145.91893, 412.22485, 145.45311, 412.25122);
        ((GeneralPath) shape).lineTo(145.09325, 412.46216);
        ((GeneralPath) shape).lineTo(145.02196, 412.96216);
        ((GeneralPath) shape).curveTo(143.93846, 413.16382, 143.15526, 411.18433, 143.11229, 410.20142);
        ((GeneralPath) shape).curveTo(142.76268, 410.17798, 142.39842, 410.22534, 142.0532, 410.2727);
        ((GeneralPath) shape).lineTo(141.61229, 411.04126);
        ((GeneralPath) shape).curveTo(141.49998, 411.0857, 140.53123, 412.8025, 140.34325, 412.89282);
        ((GeneralPath) shape).lineTo(140.13329, 413.81274);
        ((GeneralPath) shape).curveTo(140.13329, 413.81274, 139.2407, 414.73755, 139.07323, 414.81274);
        ((GeneralPath) shape).curveTo(139.02, 414.94653, 138.07323, 416.1516, 138.07323, 416.1516);
        ((GeneralPath) shape).curveTo(138.08397, 416.18237, 137.74559, 417.19897, 137.72313, 417.36157);
        ((GeneralPath) shape).curveTo(137.62498, 417.406, 137.38817, 418.00513, 137.23192, 417.92212);
        ((GeneralPath) shape).curveTo(137.09373, 417.97095, 135.87401, 418.63794, 135.73192, 418.71216);
        ((GeneralPath) shape).lineTo(135.38231, 418.98267);
        ((GeneralPath) shape).lineTo(135.03319, 418.71216);
        ((GeneralPath) shape).curveTo(132.58495, 421.1775, 130.33104, 423.90894, 128.02196, 426.50122);
        ((GeneralPath) shape).curveTo(126.89354, 427.7683, 125.83934, 429.07495, 124.54296, 430.18286);
        ((GeneralPath) shape).curveTo(124.21679, 430.052, 124.05712, 429.63696, 123.62304, 429.69263);
        ((GeneralPath) shape).curveTo(123.62304, 429.69263, 122.50195, 429.35278, 122.39892, 429.3235);
        ((GeneralPath) shape).curveTo(122.17285, 429.0808, 121.87548, 428.77222, 121.63232, 428.55298);
        ((GeneralPath) shape).curveTo(121.63232, 428.55298, 121.30615, 427.6897, 121.35302, 427.49146);
        ((GeneralPath) shape).curveTo(121.29882, 427.32837, 120.9204, 426.87817, 120.85302, 426.7815);
        ((GeneralPath) shape).curveTo(120.48486, 427.0515, 120.22948, 427.40698, 119.9331, 427.70142);
        ((GeneralPath) shape).curveTo(119.80712, 427.88306, 119.39697, 428.54077, 119.37304, 428.55298);
        ((GeneralPath) shape).lineTo(119.37304, 428.84302);
        ((GeneralPath) shape).curveTo(119.20654, 429.6692, 119.60449, 430.59106, 119.50195, 431.32153);
        ((GeneralPath) shape).curveTo(119.54736, 431.64233, 119.6958, 431.865, 119.65185, 432.09302);
        ((GeneralPath) shape).curveTo(119.63574, 432.17798, 119.43554, 432.78052, 119.44189, 432.80298);
        ((GeneralPath) shape).curveTo(119.44189, 432.80298, 118.72851, 433.5481, 118.66308, 433.51294);
        ((GeneralPath) shape).lineTo(117.95312, 433.59302);
        ((GeneralPath) shape).curveTo(117.95312, 433.59302, 116.73144, 432.97534, 116.67187, 432.88306);
        ((GeneralPath) shape).curveTo(115.92822, 432.85815, 116.06591, 432.90796, 115.47314, 433.23267);
        ((GeneralPath) shape).curveTo(115.21582, 433.75513, 114.54296, 434.93286, 114.54296, 434.93286);
        ((GeneralPath) shape).curveTo(114.02929, 435.3562, 113.98192, 436.6189, 113.98192, 437.13306);
        ((GeneralPath) shape).lineTo(113.91307, 437.62134);
        ((GeneralPath) shape).lineTo(113.62303, 438.3313);
        ((GeneralPath) shape).lineTo(113.62303, 438.76294);
        ((GeneralPath) shape).curveTo(113.89207, 439.02466, 114.69041, 439.74683, 114.69041, 439.74683);
        ((GeneralPath) shape).curveTo(114.69041, 439.74683, 115.31492, 440.41138, 115.25193, 440.6028);
        ((GeneralPath) shape).curveTo(115.25193, 440.6028, 115.5742, 441.8694, 115.54295, 442.09302);
        ((GeneralPath) shape).curveTo(115.54295, 442.09302, 116.32029, 442.6433, 116.39305, 442.5813);
        ((GeneralPath) shape).lineTo(116.89305, 443.43286);
        ((GeneralPath) shape).lineTo(116.9619, 444.2229);
        ((GeneralPath) shape).lineTo(117.38231, 444.71216);
        ((GeneralPath) shape).lineTo(117.38231, 445.06277);
        ((GeneralPath) shape).lineTo(117.24315, 445.28152);
        ((GeneralPath) shape).lineTo(117.24315, 446.12134);
        ((GeneralPath) shape).curveTo(117.31883, 446.31863, 117.45311, 446.7727, 117.45311, 446.7727);
        ((GeneralPath) shape).curveTo(117.45311, 446.7727, 116.88866, 447.4783, 116.81297, 447.54126);
        ((GeneralPath) shape).lineTo(115.83299, 447.62134);
        ((GeneralPath) shape).curveTo(115.83299, 447.62134, 115.24901, 448.06226, 115.18309, 448.12134);
        ((GeneralPath) shape).curveTo(115.24364, 448.18335, 114.69188, 448.54126, 114.69188, 448.54126);
        ((GeneralPath) shape).lineTo(114.62303, 448.04126);
        ((GeneralPath) shape).curveTo(114.6577, 448.02563, 114.83299, 447.4729, 114.83299, 447.4729);
        ((GeneralPath) shape).lineTo(114.83299, 446.91138);
        ((GeneralPath) shape).curveTo(114.83299, 446.91138, 114.59813, 446.52808, 114.54295, 446.48267);
        ((GeneralPath) shape).lineTo(114.47313, 445.7727);
        ((GeneralPath) shape).curveTo(114.47313, 445.7727, 114.20116, 445.08572, 113.91307, 444.99146);
        ((GeneralPath) shape).curveTo(113.78856, 444.73755, 113.27196, 443.8616, 113.27196, 443.8616);
        ((GeneralPath) shape).lineTo(113.12303, 443.08133);
        ((GeneralPath) shape).curveTo(113.09373, 442.8865, 112.78416, 442.2117, 112.70311, 442.09305);
        ((GeneralPath) shape).curveTo(112.47069, 441.9822, 111.9536, 441.16385, 111.7119, 441.2415);
        ((GeneralPath) shape).curveTo(111.56786, 441.0452, 110.29735, 440.36356, 110.16307, 440.39285);
        ((GeneralPath) shape).curveTo(110.05516, 440.26395, 109.82811, 440.21756, 109.72313, 440.1028);
        ((GeneralPath) shape).curveTo(108.22118, 438.4617, 99.71581, 427.02908, 96.76317, 423.2415);
        ((GeneralPath) shape).curveTo(95.64598, 421.8079, 94.07323, 419.407, 92.93309, 418.2122);
        ((GeneralPath) shape).curveTo(92.36327, 417.61502, 91.44823, 417.11844, 90.80321, 416.58133);
        ((GeneralPath) shape).lineTo(76.92186, 405.02274);
        ((GeneralPath) shape).lineTo(72.73192, 401.553);
        ((GeneralPath) shape).curveTo(72.6538, 401.48807, 68.3203, 400.7781, 67.84325, 400.70145);
        ((GeneralPath) shape).lineTo(67.84325, 400.06277);
        ((GeneralPath) shape).lineTo(67.63231, 399.14285);
        ((GeneralPath) shape).curveTo(67.65965, 398.98416, 67.91307, 398.64285, 67.91307, 398.64285);
        ((GeneralPath) shape).lineTo(67.91307, 398.08133);
        ((GeneralPath) shape).curveTo(67.91307, 398.08133, 67.62987, 397.33328, 67.56297, 397.303);
        ((GeneralPath) shape).curveTo(67.59715, 397.24295, 66.54832, 395.22684, 66.42186, 394.89285);
        ((GeneralPath) shape).curveTo(66.35301, 394.928, 65.71776, 395.3904, 65.43309, 395.45145);
        ((GeneralPath) shape).curveTo(65.43309, 395.45145, 64.7412, 395.64188, 64.58299, 395.6028);
        ((GeneralPath) shape).curveTo(64.59227, 395.5662, 64.02, 392.18924, 64.08299, 391.70145);
        ((GeneralPath) shape).curveTo(63.66063, 391.70145, 61.64793, 391.62674, 61.4619, 391.78152);
        ((GeneralPath) shape).curveTo(61.48778, 388.89334, 61.64989, 386.0154, 61.81297, 383.1331);
        ((GeneralPath) shape).curveTo(61.3159, 383.33328, 60.45213, 383.637, 59.90184, 383.6331);
        ((GeneralPath) shape).curveTo(59.9575, 383.55936, 60.18358, 382.5486, 60.18309, 382.34305);
        ((GeneralPath) shape).curveTo(60.38573, 382.13553, 60.60204, 381.47684, 60.62303, 381.3616);
        ((GeneralPath) shape).curveTo(60.66551, 381.12967, 61.47996, 376.20242, 61.4619, 376.1116);
        ((GeneralPath) shape).curveTo(61.61913, 375.56863, 61.04149, 373.95728, 61.4619, 373.13306);
        ((GeneralPath) shape).curveTo(61.31835, 373.0017, 61.18602, 371.72488, 61.18309, 371.5022);
        ((GeneralPath) shape).curveTo(61.15819, 369.5359, 61.87498, 368.4832, 61.89305, 366.8313);
        ((GeneralPath) shape).curveTo(61.81297, 365.8938, 61.60887, 365.12234, 61.9619, 364.35278);
        ((GeneralPath) shape).curveTo(62.02245, 364.22144, 62.14012, 364.07544, 62.10301, 363.92212);
        ((GeneralPath) shape).curveTo(62.46629, 363.55444, 63.12156, 362.07983, 63.23192, 362.01294);
        ((GeneralPath) shape).curveTo(63.22704, 361.5149, 63.15917, 361.12866, 63.10301, 360.66138);
        ((GeneralPath) shape).curveTo(62.98826, 359.70486, 63.17235, 358.6521, 63.16307, 357.68286);
        ((GeneralPath) shape).curveTo(63.21483, 357.531, 63.33153, 356.9402, 63.37303, 356.8313);
        ((GeneralPath) shape).lineTo(62.45311, 356.8313);
        ((GeneralPath) shape).lineTo(62.24315, 356.91138);
        ((GeneralPath) shape).curveTo(62.11815, 357.09744, 61.53221, 357.29617, 61.33299, 357.26294);
        ((GeneralPath) shape).lineTo(59.69188, 357.3313);
        ((GeneralPath) shape).curveTo(59.62401, 357.3313, 58.92723, 357.08325, 58.91307, 357.05298);
        ((GeneralPath) shape).curveTo(58.06053, 357.25952, 56.08787, 355.88306, 55.22313, 356.12134);
        ((GeneralPath) shape).lineTo(54.66307, 355.99146);
        ((GeneralPath) shape).lineTo(54.37303, 356.2727);
        ((GeneralPath) shape).curveTo(54.37303, 356.2727, 53.69481, 356.45093, 53.45311, 356.41138);
        ((GeneralPath) shape).curveTo(53.4243, 356.50613, 51.5869, 357.1111, 51.39305, 357.3313);
        ((GeneralPath) shape).curveTo(51.28905, 357.30054, 45.95604, 359.02612, 45.45311, 359.18286);
        ((GeneralPath) shape).lineTo(46.37303, 355.91138);
        ((GeneralPath) shape).lineTo(46.16307, 355.91138);
        ((GeneralPath) shape).curveTo(46.50536, 353.3235, 46.87303, 350.55884, 47.64305, 348.05298);
        ((GeneralPath) shape).lineTo(46.30321, 347.9729);
        ((GeneralPath) shape).lineTo(45.94188, 347.34302);
        ((GeneralPath) shape).curveTo(45.80663, 347.46802, 45.66649, 347.67407, 45.51317, 347.76294);
        ((GeneralPath) shape).curveTo(45.37792, 347.83862, 44.90917, 348.135, 44.88231, 348.12134);
        ((GeneralPath) shape).lineTo(44.66307, 348.12134);
        ((GeneralPath) shape).lineTo(44.74315, 346.78152);
        ((GeneralPath) shape).curveTo(44.76122, 346.4363, 44.84667, 345.81763, 44.88231, 345.78152);
        ((GeneralPath) shape).curveTo(44.60643, 345.8196, 43.06981, 345.63354, 42.89305, 345.49146);
        ((GeneralPath) shape).curveTo(42.41893, 345.17166, 41.98241, 344.9319, 41.62303, 344.57156);
        ((GeneralPath) shape).curveTo(40.10985, 343.05496, 38.645, 343.2556, 37.01317, 342.09302);
        ((GeneralPath) shape).curveTo(36.97557, 342.10962, 35.34081, 341.00613, 35.30321, 340.96216);
        ((GeneralPath) shape).curveTo(35.30321, 340.96216, 34.0913, 340.65894, 33.9619, 340.61157);
        ((GeneralPath) shape).curveTo(33.81712, 340.198, 32.95921, 339.4143, 32.90209, 339.26294);
        ((GeneralPath) shape).curveTo(32.66967, 338.489, 30.84887, 337.7527, 30.78344, 337.63306);
        ((GeneralPath) shape).curveTo(30.78344, 337.63306, 29.69091, 336.72244, 29.63232, 336.63306);
        ((GeneralPath) shape).curveTo(29.43261, 336.15994, 31.67211, 328.97095, 32.05322, 327.78152);
        ((GeneralPath) shape).lineTo(31.98193, 326.7913);
        ((GeneralPath) shape).curveTo(32.34546, 325.64188, 33.8208, 320.76785, 33.96191, 319.56277);
        ((GeneralPath) shape).curveTo(34.75488, 318.762, 35.22656, 318.11646, 35.66308, 317.01297);
        ((GeneralPath) shape).curveTo(36.34863, 317.24002, 37.39501, 317.45486, 38.01318, 317.7913);
        ((GeneralPath) shape).curveTo(38.60498, 318.11356, 39.13086, 318.83035, 39.70312, 319.2122);
        ((GeneralPath) shape).curveTo(41.20458, 320.21414, 42.83593, 321.10623, 44.38232, 322.0413);
        ((GeneralPath) shape).lineTo(44.66308, 321.4827);
        ((GeneralPath) shape).curveTo(44.53222, 321.30057, 43.56054, 319.89774, 43.46191, 319.8528);
        ((GeneralPath) shape).curveTo(43.36279, 319.6531, 43.24316, 319.27274, 43.24316, 319.27274);
        ((GeneralPath) shape).curveTo(43.28906, 319.00565, 42.39746, 315.42606, 42.32324, 315.1028);
        ((GeneralPath) shape).curveTo(42.31054, 315.04666, 42.14502, 314.9456, 42.1123, 314.89285);
        ((GeneralPath) shape).curveTo(42.07226, 314.8279, 41.58203, 312.51492, 41.62304, 312.26297);
        ((GeneralPath) shape).lineTo(38.64306, 312.6829);
        ((GeneralPath) shape).lineTo(38.2832, 312.12137);
        ((GeneralPath) shape).curveTo(38.50488, 311.71365, 38.66845, 311.31815, 38.99316, 310.9915);
        ((GeneralPath) shape).lineTo(38.99316, 310.64285);
        ((GeneralPath) shape).curveTo(38.80664, 310.43924, 38.70117, 310.17703, 38.50195, 309.9915);
        ((GeneralPath) shape).curveTo(38.40771, 309.80252, 38.3623, 309.22293, 38.3623, 309.22293);
        ((GeneralPath) shape).lineTo(38.4331, 308.9329);
        ((GeneralPath) shape).curveTo(38.4331, 308.9329, 38.04248, 308.3782, 38.01318, 308.22293);
        ((GeneralPath) shape).lineTo(37.3623, 308.1614);
        ((GeneralPath) shape).curveTo(36.53271, 307.94852, 34.85791, 306.53348, 34.60302, 305.8128);
        ((GeneralPath) shape).curveTo(34.93505, 305.7161, 35.29198, 303.96368, 35.66308, 303.47296);
        ((GeneralPath) shape).lineTo(34.46191, 299.72296);
        ((GeneralPath) shape).lineTo(34.11254, 299.78156);
        ((GeneralPath) shape).lineTo(30.70312, 289.2327);
        ((GeneralPath) shape).curveTo(30.98632, 289.3504, 31.52905, 289.5003, 31.8435, 289.44266);
        ((GeneralPath) shape).lineTo(31.98193, 287.8831);
        ((GeneralPath) shape).curveTo(32.39038, 287.70145, 33.37085, 287.42557, 33.82324, 287.60284);
        ((GeneralPath) shape).lineTo(34.46191, 287.46222);
        ((GeneralPath) shape).curveTo(35.0708, 287.16095, 35.66796, 286.638, 36.17089, 286.1927);
        ((GeneralPath) shape).curveTo(37.37646, 286.64972, 38.4204, 287.2503, 39.57323, 287.8128);
        ((GeneralPath) shape).curveTo(39.78173, 287.91437, 43.2705, 290.74005, 43.67186, 291.0716);
        ((GeneralPath) shape).curveTo(44.35643, 291.63702, 45.26707, 291.83478, 45.94188, 292.34308);
        ((GeneralPath) shape).curveTo(46.06004, 292.43195, 46.68553, 293.18927, 46.72313, 293.27277);
        ((GeneralPath) shape).curveTo(47.09569, 293.4095, 50.1743, 294.7542, 51.33202, 295.263);
        ((GeneralPath) shape).curveTo(52.49022, 295.7718, 53.90673, 295.74884, 54.87304, 296.60284);
        ((GeneralPath) shape).curveTo(55.41699, 297.0833, 55.76757, 297.79178, 56.29199, 298.30304);
        ((GeneralPath) shape).curveTo(56.33935, 298.34943, 56.4414, 298.41583, 56.50195, 298.4427);
        ((GeneralPath) shape).curveTo(58.69775, 299.41583, 58.80224, 299.4124, 60.89306, 300.71222);
        ((GeneralPath) shape).curveTo(62.44775, 301.67853, 64.08447, 302.43585, 65.85302, 302.91144);
        ((GeneralPath) shape).curveTo(66.40331, 303.0594, 67.80126, 303.66632, 68.333, 303.55304);
        ((GeneralPath) shape).curveTo(68.49169, 303.51935, 68.65575, 303.37238, 68.833, 303.33136);
        ((GeneralPath) shape).curveTo(69.33105, 303.50128, 70.09228, 303.9046, 70.54296, 304.18292);
        ((GeneralPath) shape).curveTo(71.63476, 304.85675, 74.35155, 305.44806, 75.50194, 305.8128);
        ((GeneralPath) shape).lineTo(75.85301, 307.013);
        ((GeneralPath) shape).curveTo(76.31541, 307.20193, 78.56151, 307.72394, 78.9619, 307.66144);
        ((GeneralPath) shape).curveTo(79.86571, 307.5208, 80.02147, 306.95636, 80.67186, 306.52277);
        ((GeneralPath) shape).curveTo(81.42528, 306.0208, 82.26268, 305.65753, 83.01317, 305.10284);
        ((GeneralPath) shape).curveTo(82.94042, 306.29132, 82.84667, 307.60724, 82.94188, 308.79132);
        ((GeneralPath) shape).curveTo(83.08153, 310.5213, 83.92479, 313.21075, 84.45555, 314.9212);
        ((GeneralPath) shape).curveTo(87.30321, 324.09503, 92.35496, 324.0589, 100.93309, 324.3128);
        ((GeneralPath) shape).curveTo(103.66112, 324.39337, 106.81248, 323.84357, 109.37303, 322.96222);
        ((GeneralPath) shape).curveTo(109.96239, 322.75958, 110.62694, 322.47052, 111.22313, 322.33136);
        ((GeneralPath) shape).curveTo(111.91893, 321.1302, 112.52049, 320.97833, 113.70311, 320.48273);
        ((GeneralPath) shape).curveTo(116.44188, 319.33527, 119.98485, 318.23468, 122.91307, 319.21222);
        ((GeneralPath) shape).curveTo(124.21532, 319.64728, 125.53807, 319.90265, 126.88231, 320.20148);
        ((GeneralPath) shape).lineTo(127.02196, 319.91144);
        ((GeneralPath) shape).curveTo(127.062, 319.9002, 129.18602, 320.13947, 130.07323, 320.0628);
        ((GeneralPath) shape).curveTo(130.99901, 319.98273, 131.79442, 319.53546, 132.76317, 319.77277);
        ((GeneralPath) shape).curveTo(132.72948, 320.04865, 132.8701, 320.2967, 132.833, 320.5628);
        ((GeneralPath) shape).curveTo(132.833, 320.5628, 133.37157, 321.2845, 133.54295, 321.48273);
        ((GeneralPath) shape).curveTo(133.63377, 321.45734, 134.09567, 321.67755, 134.25192, 321.6927);
        ((GeneralPath) shape).curveTo(138.77048, 322.13605, 136.71774, 321.20685, 140.5532, 323.75226);
        ((GeneralPath) shape).curveTo(140.7324, 323.8709, 141.73045, 324.42755, 141.97311, 324.59308);
        ((GeneralPath) shape).curveTo(142.83495, 324.38995, 150.13914, 329.87286, 155.93307, 326.71222);
        ((GeneralPath) shape).lineTo(156.22311, 327.36163);
        ((GeneralPath) shape).lineTo(156.78317, 327.0716);
        ((GeneralPath) shape).lineTo(156.57323, 326.50223);
        ((GeneralPath) shape).lineTo(157.78317, 325.87137);
        ((GeneralPath) shape).lineTo(157.99313, 326.58133);
        ((GeneralPath) shape).lineTo(158.49313, 326.3616);
        ((GeneralPath) shape).lineTo(158.28317, 325.65164);
        ((GeneralPath) shape).curveTo(158.90231, 325.2615, 159.9194, 325.10184, 160.62302, 324.8831);
        ((GeneralPath) shape).lineTo(161.603, 325.7327);
        ((GeneralPath) shape).curveTo(161.74362, 325.63458, 161.88474, 325.5281, 162.03317, 325.44266);
        ((GeneralPath) shape).curveTo(163.14159, 324.804, 165.98434, 323.75223, 166.07323, 323.75223);
        ((GeneralPath) shape).lineTo(168.2031, 323.75223);
        ((GeneralPath) shape).curveTo(169.25388, 323.1966, 169.3579, 321.40848, 169.83298, 320.4827);
        ((GeneralPath) shape).curveTo(170.06491, 320.54376, 170.76022, 320.055, 170.89304, 319.85284);
        ((GeneralPath) shape).curveTo(171.6074, 318.76688, 172.29587, 317.55106, 173.08298, 316.52274);
        ((GeneralPath) shape).curveTo(173.69724, 315.72098, 174.79245, 315.5833, 175.43307, 314.8128);
        ((GeneralPath) shape).lineTo(178.97311, 315.52274);
        ((GeneralPath) shape).curveTo(179.46628, 323.21906, 180.16306, 332.7156, 181.52196, 340.26297);
        ((GeneralPath) shape).lineTo(181.66306, 340.53152);
        ((GeneralPath) shape).curveTo(181.99509, 341.53104, 182.45409, 342.29373, 182.94186, 343.2327);
        ((GeneralPath) shape).curveTo(183.05856, 343.38602, 183.12936, 343.5618, 183.2319, 343.72293);
        ((GeneralPath) shape).curveTo(184.9609, 346.43387, 187.97604, 348.4915, 189.3823, 351.3831);
        ((GeneralPath) shape).curveTo(191.478, 355.69217, 193.68063, 359.95877, 195.77196, 364.27274);
        ((GeneralPath) shape).curveTo(196.1621, 365.07693, 197.03954, 366.7947, 197.55856, 367.4622);
        ((GeneralPath) shape).curveTo(199.19724, 370.10916, 202.19334, 371.98563, 204.5532, 373.84305);
        ((GeneralPath) shape).curveTo(207.84715, 376.43533, 210.20554, 378.5154, 214.2031, 380.01297);
        ((GeneralPath) shape).curveTo(215.43503, 380.4744, 217.79343, 380.89334, 219.08298, 381.2122);
        ((GeneralPath) shape).curveTo(220.8818, 381.657, 222.77487, 382.0994, 224.54294, 382.6331);
        ((GeneralPath) shape).curveTo(226.71579, 383.28885, 232.05856, 384.86746, 232.33298, 384.90164);
        ((GeneralPath) shape).curveTo(235.26071, 385.26736, 235.89401, 385.81082, 239.00192, 385.053);
        ((GeneralPath) shape).curveTo(239.28172, 384.98465, 239.57079, 384.95975, 239.85204, 384.90164);
        ((GeneralPath) shape).curveTo(246.50143, 383.5281, 253.9194, 380.3074, 260.64938, 383.03836);
        ((GeneralPath) shape).curveTo(261.6904, 383.46072, 262.50925, 384.02664, 263.45163, 384.6116);
        ((GeneralPath) shape).curveTo(265.40573, 385.824, 267.37546, 386.9075, 269.26315, 388.2327);
        ((GeneralPath) shape).curveTo(272.50977, 390.51147, 273.91406, 394.19458, 276.7798, 396.74146);
        ((GeneralPath) shape).closePath();
        
        // transformieren:
        Shape newShape = transformiere(shape);
        return  newShape;
    }

}
