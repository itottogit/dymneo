import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

/**
 * Ein BNord, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author  Torsten Otto
 * @version 10/2022
 */
public class BNord extends Bezirk
{

    /**
     * Erzeuge einen neuen BNord mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public BNord() {
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

                ((GeneralPath) shape).moveTo(238.22754, 252.09302);
        ((GeneralPath) shape).curveTo(240.26172, 253.83911, 242.4414, 255.56079, 244.38232, 257.41138);
        ((GeneralPath) shape).curveTo(244.479, 257.47485, 245.27248, 258.0349, 245.31203, 258.05298);
        ((GeneralPath) shape).curveTo(245.5415, 258.15747, 245.87988, 258.2068, 246.09229, 258.3313);
        ((GeneralPath) shape).curveTo(246.38379, 258.5022, 253.40967, 264.75513, 253.46191, 264.7815);
        ((GeneralPath) shape).curveTo(253.56982, 264.52222, 254.43604, 263.58765, 254.73193, 263.37134);
        ((GeneralPath) shape).curveTo(256.83105, 261.8352, 258.8755, 260.29907, 261.11182, 258.9729);
        ((GeneralPath) shape).curveTo(261.26807, 258.88013, 262.9536, 257.64087, 262.9995, 257.66138);
        ((GeneralPath) shape).lineTo(262.53174, 256.7815);
        ((GeneralPath) shape).curveTo(261.04834, 254.1946, 260.32864, 253.20583, 258.6333, 250.82153);
        ((GeneralPath) shape).lineTo(257.85205, 249.69263);
        ((GeneralPath) shape).curveTo(259.09326, 248.61987, 260.32568, 247.53296, 261.53174, 246.42163);
        ((GeneralPath) shape).curveTo(264.0625, 244.0896, 265.84717, 243.11157, 268.9292, 241.6399);
        ((GeneralPath) shape).curveTo(269.99854, 241.12915, 271.1709, 240.63062, 272.1626, 239.98267);
        ((GeneralPath) shape).curveTo(272.39407, 239.90161, 272.88135, 239.84985, 273.09326, 239.84155);
        ((GeneralPath) shape).lineTo(273.1626, 240.12134);
        ((GeneralPath) shape).curveTo(274.56885, 239.40942, 276.3452, 238.77759, 277.62354, 237.85278);
        ((GeneralPath) shape).curveTo(278.0996, 237.50806, 278.32083, 236.98804, 278.47318, 236.44263);
        ((GeneralPath) shape).curveTo(278.51712, 236.28638, 278.73, 236.04909, 278.7632, 236.08179);
        ((GeneralPath) shape).curveTo(279.1929, 235.99048, 279.47757, 235.79712, 279.75342, 235.73267);
        ((GeneralPath) shape).curveTo(279.79004, 236.05933, 279.8291, 236.38892, 279.89307, 236.71167);
        ((GeneralPath) shape).curveTo(281.8057, 235.66235, 283.30762, 233.88892, 285.063, 232.61157);
        ((GeneralPath) shape).lineTo(285.21338, 231.83179);
        ((GeneralPath) shape).curveTo(285.74902, 231.5022, 286.62354, 230.31226, 287.063, 229.91138);
        ((GeneralPath) shape).lineTo(286.98196, 229.70142);
        ((GeneralPath) shape).curveTo(287.59915, 229.44312, 288.20215, 229.1433, 288.8335, 228.92162);
        ((GeneralPath) shape).curveTo(289.64163, 227.81566, 290.54153, 226.7263, 291.313, 225.60277);
        ((GeneralPath) shape).curveTo(292.47903, 223.9055, 294.47217, 218.30638, 294.14307, 216.38158);
        ((GeneralPath) shape).lineTo(293.50342, 216.74144);
        ((GeneralPath) shape).lineTo(293.29346, 216.31273);
        ((GeneralPath) shape).curveTo(291.99756, 216.21751, 290.4678, 215.93724, 289.1831, 216.03148);
        ((GeneralPath) shape).curveTo(289.1558, 215.5559, 289.16116, 214.37962, 289.54346, 214.11156);
        ((GeneralPath) shape).curveTo(289.49368, 213.99388, 289.75342, 213.33177, 289.75342, 213.33177);
        ((GeneralPath) shape).curveTo(287.9463, 213.48558, 282.7178, 210.63548, 280.10303, 210.92162);
        ((GeneralPath) shape).curveTo(280.10303, 210.92162, 279.54004, 210.60716, 279.47318, 210.6428);
        ((GeneralPath) shape).curveTo(279.41797, 210.51341, 279.21094, 210.197, 279.25342, 210.01144);
        ((GeneralPath) shape).curveTo(279.21338, 209.89622, 279.15332, 209.8259, 279.12354, 209.86156);
        ((GeneralPath) shape).curveTo(278.93213, 209.59885, 278.5391, 209.44408, 278.62354, 209.01144);
        ((GeneralPath) shape).curveTo(278.5186, 208.93333, 278.24075, 208.49779, 278.19193, 208.3713);
        ((GeneralPath) shape).lineTo(277.9126, 208.23264);
        ((GeneralPath) shape).curveTo(277.69385, 208.00607, 277.61035, 207.70627, 277.48196, 207.53146);
        ((GeneralPath) shape).curveTo(277.53128, 207.32542, 277.22757, 205.16379, 277.272, 204.61156);
        ((GeneralPath) shape).curveTo(277.272, 204.61156, 277.09378, 203.65794, 277.06302, 203.6926);
        ((GeneralPath) shape).curveTo(276.96048, 203.37424, 276.7515, 203.04514, 276.56302, 202.77267);
        ((GeneralPath) shape).curveTo(276.57864, 202.74242, 276.459, 202.51047, 276.42337, 202.49142);
        ((GeneralPath) shape).curveTo(276.38284, 202.19504, 276.6299, 201.15353, 276.85306, 201.0715);
        ((GeneralPath) shape).curveTo(276.78128, 200.90353, 277.85355, 200.4099, 277.7017, 199.9426);
        ((GeneralPath) shape).lineTo(277.772, 199.65158);
        ((GeneralPath) shape).curveTo(277.23245, 200.155, 274.0547, 198.07297, 273.5835, 197.81271);
        ((GeneralPath) shape).lineTo(273.30325, 198.09152);
        ((GeneralPath) shape).curveTo(271.28128, 196.9338, 270.4702, 196.56906, 269.12354, 194.6926);
        ((GeneralPath) shape).curveTo(268.57227, 193.92404, 268.0122, 192.967, 267.35303, 192.28146);
        ((GeneralPath) shape).curveTo(267.3936, 192.20285, 266.78174, 191.79172, 266.78174, 191.79172);
        ((GeneralPath) shape).curveTo(266.67432, 191.28291, 266.6079, 190.78487, 266.4917, 190.3713);
        ((GeneralPath) shape).lineTo(267.20166, 190.23264);
        ((GeneralPath) shape).curveTo(267.20117, 188.44553, 266.97314, 186.61543, 266.78174, 184.84152);
        ((GeneralPath) shape).curveTo(266.86084, 184.75607, 266.8745, 184.59055, 266.85303, 184.48264);
        ((GeneralPath) shape).curveTo(268.89453, 181.28732, 270.19824, 177.74533, 271.7417, 174.28146);
        ((GeneralPath) shape).curveTo(272.76807, 174.84348, 276.27002, 177.01584, 277.35303, 176.98264);
        ((GeneralPath) shape).curveTo(277.8662, 174.75021, 280.54984, 171.58955, 283.0835, 171.8713);
        ((GeneralPath) shape).curveTo(283.3208, 171.89767, 284.21338, 172.22237, 284.21338, 172.22237);
        ((GeneralPath) shape).lineTo(285.14307, 172.22237);
        ((GeneralPath) shape).curveTo(285.4678, 172.2546, 285.61133, 172.43526, 285.772, 172.5124);
        ((GeneralPath) shape).curveTo(286.82132, 173.01582, 286.4009, 173.00606, 287.62354, 173.01143);
        ((GeneralPath) shape).curveTo(287.7095, 172.90205, 288.13528, 172.91768, 288.25342, 172.93233);
        ((GeneralPath) shape).curveTo(288.57373, 172.95088, 289.2295, 173.54805, 289.32178, 173.50166);
        ((GeneralPath) shape).curveTo(289.71533, 173.5505, 290.01614, 173.68575, 290.313, 173.64278);
        ((GeneralPath) shape).curveTo(290.52344, 173.68916, 290.96387, 173.94844, 291.09326, 174.00166);
        ((GeneralPath) shape).lineTo(291.52197, 173.64278);
        ((GeneralPath) shape).lineTo(292.5835, 174.21162);
        ((GeneralPath) shape).curveTo(293.38672, 173.60371, 293.8125, 173.00313, 294.42334, 172.22237);
        ((GeneralPath) shape).lineTo(295.21338, 172.22237);
        ((GeneralPath) shape).curveTo(295.2578, 171.9543, 295.30225, 171.61885, 295.42334, 171.3713);
        ((GeneralPath) shape).lineTo(295.063, 171.31271);
        ((GeneralPath) shape).lineTo(295.42334, 169.60275);
        ((GeneralPath) shape).lineTo(296.62354, 169.89279);
        ((GeneralPath) shape).lineTo(297.1919, 169.11154);
        ((GeneralPath) shape).curveTo(298.063, 167.9089, 297.74805, 166.57687, 298.53174, 165.85275);
        ((GeneralPath) shape).lineTo(298.82178, 165.9216);
        ((GeneralPath) shape).lineTo(298.8833, 166.28146);
        ((GeneralPath) shape).lineTo(300.4419, 166.41135);
        ((GeneralPath) shape).lineTo(300.52197, 165.14279);
        ((GeneralPath) shape).lineTo(301.09326, 165.14279);
        ((GeneralPath) shape).lineTo(301.15186, 164.15158);
        ((GeneralPath) shape).lineTo(301.4419, 164.15158);
        ((GeneralPath) shape).lineTo(301.6001, 162.00607);
        ((GeneralPath) shape).lineTo(301.30322, 161.88156);
        ((GeneralPath) shape).curveTo(301.02295, 161.64377, 299.3086, 160.31662, 299.2417, 160.03146);
        ((GeneralPath) shape).lineTo(295.6333, 160.03146);
        ((GeneralPath) shape).lineTo(295.48193, 156.99142);
        ((GeneralPath) shape).lineTo(294.71338, 156.28146);
        ((GeneralPath) shape).lineTo(292.4419, 156.4216);
        ((GeneralPath) shape).curveTo(292.07178, 156.8132, 282.65137, 160.41623, 281.313, 160.96164);
        ((GeneralPath) shape).curveTo(281.16455, 160.67355, 280.49268, 156.82004, 280.39307, 156.36154);
        ((GeneralPath) shape).lineTo(278.97314, 156.78146);
        ((GeneralPath) shape).curveTo(279.02002, 156.59103, 278.8335, 156.43869, 278.8335, 156.36154);
        ((GeneralPath) shape).curveTo(278.8335, 156.16525, 278.96875, 154.9255, 278.6919, 154.80148);
        ((GeneralPath) shape).curveTo(278.6919, 154.80148, 278.36084, 154.04904, 278.4126, 153.80148);
        ((GeneralPath) shape).curveTo(278.26514, 153.11642, 278.4497, 152.48361, 278.3335, 151.8215);
        ((GeneralPath) shape).curveTo(278.27832, 151.50607, 278.01514, 151.12228, 277.98193, 150.8215);
        ((GeneralPath) shape).curveTo(277.90576, 150.134, 277.8413, 149.44992, 277.70166, 148.77267);
        ((GeneralPath) shape).curveTo(277.70166, 148.77267, 276.92773, 147.27365, 276.85303, 146.86154);
        ((GeneralPath) shape).curveTo(275.8169, 147.40158, 275.2456, 148.40256, 274.37354, 148.98264);
        ((GeneralPath) shape).lineTo(272.2417, 150.40158);
        ((GeneralPath) shape).curveTo(271.85352, 150.48605, 271.17773, 150.05978, 270.97314, 149.76242);
        ((GeneralPath) shape).curveTo(270.85498, 149.73654, 270.26074, 149.61789, 270.1831, 149.55148);
        ((GeneralPath) shape).curveTo(269.2329, 149.4631, 268.5869, 150.77168, 268.1333, 151.3215);
        ((GeneralPath) shape).curveTo(267.979, 151.49484, 266.88672, 151.7136, 266.64307, 151.6716);
        ((GeneralPath) shape).curveTo(266.4126, 151.81564, 266.1162, 152.15353, 265.9331, 152.24142);
        ((GeneralPath) shape).lineTo(265.57178, 152.95139);
        ((GeneralPath) shape).curveTo(265.4004, 153.04807, 265.04102, 153.18771, 265.0132, 153.23264);
        ((GeneralPath) shape).curveTo(265.0132, 153.23264, 264.56104, 153.45625, 264.5933, 153.52267);
        ((GeneralPath) shape).curveTo(264.5342, 153.63937, 264.4517, 153.9426, 264.4517, 153.9426);
        ((GeneralPath) shape).curveTo(264.56396, 154.00655, 264.59866, 154.63889, 264.72318, 154.72238);
        ((GeneralPath) shape).lineTo(264.5132, 155.29172);
        ((GeneralPath) shape).curveTo(264.3008, 155.39377, 264.1558, 155.61496, 264.0132, 155.5715);
        ((GeneralPath) shape).lineTo(263.1626, 155.6516);
        ((GeneralPath) shape).curveTo(262.5376, 155.6677, 261.95508, 154.8767, 261.47318, 155.01244);
        ((GeneralPath) shape).lineTo(261.03174, 154.6516);
        ((GeneralPath) shape).curveTo(261.00146, 154.49388, 260.90674, 154.30638, 260.82178, 154.23264);
        ((GeneralPath) shape).curveTo(260.85352, 154.18869, 260.19193, 154.01244, 260.19193, 154.01244);
        ((GeneralPath) shape).lineTo(259.7017, 153.38158);
        ((GeneralPath) shape).curveTo(259.98148, 152.9719, 260.46927, 152.85619, 260.9019, 152.67162);
        ((GeneralPath) shape).curveTo(259.8843, 151.75266, 258.76517, 150.93185, 257.71194, 150.05148);
        ((GeneralPath) shape).curveTo(257.86136, 149.81078, 258.10745, 149.55785, 258.3433, 149.4016);
        ((GeneralPath) shape).curveTo(257.7852, 149.10326, 257.26175, 148.93333, 256.78323, 148.48264);
        ((GeneralPath) shape).lineTo(256.01224, 148.13158);
        ((GeneralPath) shape).lineTo(256.07327, 147.85275);
        ((GeneralPath) shape).lineTo(254.522, 147.71165);
        ((GeneralPath) shape).lineTo(254.45316, 147.92162);
        ((GeneralPath) shape).curveTo(254.13284, 147.89915, 253.7803, 147.95724, 253.46194, 147.99142);
        ((GeneralPath) shape).curveTo(253.1255, 147.79025, 251.79788, 147.20334, 251.40189, 147.28146);
        ((GeneralPath) shape).lineTo(250.76224, 147.71165);
        ((GeneralPath) shape).curveTo(250.27638, 147.50853, 249.80618, 147.1599, 249.28323, 147.0715);
        ((GeneralPath) shape).lineTo(249.28323, 146.71165);
        ((GeneralPath) shape).lineTo(247.01224, 145.73265);
        ((GeneralPath) shape).lineTo(246.73196, 146.1516);
        ((GeneralPath) shape).curveTo(246.40433, 145.69798, 246.39359, 145.36742, 246.37308, 144.8015);
        ((GeneralPath) shape).curveTo(247.3931, 144.1013, 247.97366, 142.15062, 248.71194, 140.9016);
        ((GeneralPath) shape).curveTo(249.56448, 139.45921, 250.48734, 137.9309, 251.40189, 136.51244);
        ((GeneralPath) shape).curveTo(253.43507, 133.35912, 255.6636, 130.26878, 257.78226, 127.16137);
        ((GeneralPath) shape).lineTo(257.78226, 126.87133);
        ((GeneralPath) shape).curveTo(258.5386, 126.42797, 259.53616, 125.49242, 259.91263, 124.68237);
        ((GeneralPath) shape).curveTo(259.58743, 122.99389, 259.68753, 120.9812, 259.91263, 119.29175);
        ((GeneralPath) shape).curveTo(259.3799, 119.26685, 258.814, 119.19751, 258.28226, 119.22241);
        ((GeneralPath) shape).curveTo(258.17044, 118.51391, 258.31595, 117.94848, 258.28226, 117.38159);
        ((GeneralPath) shape).curveTo(258.2642, 117.24194, 258.7012, 116.9685, 258.70218, 116.88159);
        ((GeneralPath) shape).curveTo(258.709, 116.35815, 258.584, 115.2522, 258.55325, 115.18237);
        ((GeneralPath) shape).curveTo(258.59766, 114.927, 258.8433, 114.47241, 258.8433, 114.47241);
        ((GeneralPath) shape).lineTo(258.49222, 114.05151);
        ((GeneralPath) shape).curveTo(258.29935, 110.21704, 258.68948, 106.41528, 258.78226, 102.71167);
        ((GeneralPath) shape).curveTo(258.8394, 100.42896, 258.72366, 95.9314, 258.99173, 93.85278);
        ((GeneralPath) shape).curveTo(258.99808, 93.8059, 260.56497, 91.15893, 260.8218, 90.73266);
        ((GeneralPath) shape).curveTo(262.41458, 88.97192, 264.5933, 84.85278, 264.5933, 84.85278);
        ((GeneralPath) shape).lineTo(264.84622, 84.17749);
        ((GeneralPath) shape).curveTo(254.23781, 84.56616, 243.58595, 85.1477, 232.98195, 85.62134);
        ((GeneralPath) shape).curveTo(232.11281, 85.65991, 231.41261, 86.09497, 230.56203, 86.06275);
        ((GeneralPath) shape).curveTo(229.96388, 86.04029, 228.29494, 85.73902, 227.81203, 85.41138);
        ((GeneralPath) shape).curveTo(225.94435, 87.02759, 223.59718, 90.71118, 221.85304, 93.00171);
        ((GeneralPath) shape).curveTo(221.87357, 93.46362, 221.93362, 93.96167, 221.9932, 94.48267);
        ((GeneralPath) shape).curveTo(221.9932, 94.48267, 219.9463, 102.43775, 219.79298, 103.06275);
        ((GeneralPath) shape).curveTo(220.19485, 104.3523, 220.69875, 105.78931, 220.93314, 107.11158);
        ((GeneralPath) shape).curveTo(221.06204, 107.83717, 220.45753, 108.88795, 220.57327, 109.59156);
        ((GeneralPath) shape).curveTo(220.85355, 111.29713, 221.36282, 113.26002, 221.43314, 114.97242);
        ((GeneralPath) shape).curveTo(221.48878, 116.32642, 221.2842, 117.86158, 221.1431, 119.22242);
        ((GeneralPath) shape).curveTo(219.99709, 120.53346, 218.84573, 121.84254, 217.66312, 123.12135);
        ((GeneralPath) shape).lineTo(218.022, 129.14284);
        ((GeneralPath) shape).curveTo(218.07034, 129.95045, 218.0552, 132.10915, 218.09329, 132.26247);
        ((GeneralPath) shape).curveTo(217.98685, 132.32935, 217.397, 133.18092, 217.31302, 133.25172);
        ((GeneralPath) shape).curveTo(216.22464, 133.19264, 215.13773, 133.08034, 214.05325, 132.97243);
        ((GeneralPath) shape).lineTo(214.05325, 132.47243);
        ((GeneralPath) shape).lineTo(212.78323, 132.62135);
        ((GeneralPath) shape).lineTo(211.43314, 133.68239);
        ((GeneralPath) shape).lineTo(210.86234, 133.39284);
        ((GeneralPath) shape).lineTo(210.51321, 132.40163);
        ((GeneralPath) shape).lineTo(209.18655, 131.48268);
        ((GeneralPath) shape).curveTo(209.78275, 132.2903, 210.88724, 134.59401, 211.50198, 135.66139);
        ((GeneralPath) shape).lineTo(211.57327, 136.02272);
        ((GeneralPath) shape).lineTo(216.8931, 146.50172);
        ((GeneralPath) shape).curveTo(216.2422, 146.56178, 215.2261, 146.5276, 214.68314, 146.92165);
        ((GeneralPath) shape).curveTo(214.68314, 146.92165, 214.4551, 147.52956, 214.41312, 147.6316);
        ((GeneralPath) shape).lineTo(215.54298, 147.50172);
        ((GeneralPath) shape).lineTo(215.75197, 148.56276);
        ((GeneralPath) shape).lineTo(214.12306, 148.70143);
        ((GeneralPath) shape).curveTo(213.72365, 151.65065, 213.44972, 154.70876, 212.9131, 157.6316);
        ((GeneralPath) shape).curveTo(212.68654, 158.86696, 212.1426, 160.23708, 211.78322, 161.45143);
        ((GeneralPath) shape).curveTo(211.33595, 162.96413, 210.09035, 164.22585, 208.74318, 164.99147);
        ((GeneralPath) shape).curveTo(207.7549, 165.55348, 206.61037, 166.1277, 205.97316, 167.12135);
        ((GeneralPath) shape).lineTo(205.34328, 168.05153);
        ((GeneralPath) shape).curveTo(204.91359, 168.39577, 202.31252, 170.5447, 202.28322, 170.6028);
        ((GeneralPath) shape).curveTo(202.07765, 171.00954, 201.90773, 171.45338, 201.72316, 171.87135);
        ((GeneralPath) shape).lineTo(201.0132, 171.73268);
        ((GeneralPath) shape).curveTo(198.73439, 173.49391, 195.69533, 175.65456, 194.07326, 178.04176);
        ((GeneralPath) shape).curveTo(193.9546, 178.05836, 193.32472, 178.60426, 193.21193, 178.68237);
        ((GeneralPath) shape).lineTo(192.72316, 180.0227);
        ((GeneralPath) shape).lineTo(192.44191, 180.23267);
        ((GeneralPath) shape).curveTo(192.48732, 180.47437, 192.75392, 181.70874, 192.72316, 181.87134);
        ((GeneralPath) shape).curveTo(193.20314, 181.91577, 194.91457, 182.00122, 195.27199, 182.15161);
        ((GeneralPath) shape).curveTo(195.60744, 182.03784, 195.92336, 181.29321, 196.19191, 181.08179);
        ((GeneralPath) shape).curveTo(196.88087, 180.54028, 197.78712, 180.07446, 198.53322, 179.60278);
        ((GeneralPath) shape).curveTo(199.82619, 180.8279, 201.1797, 179.00269, 202.0132, 178.25172);
        ((GeneralPath) shape).curveTo(201.95998, 178.63696, 201.56789, 181.8943, 201.44191, 182.00172);
        ((GeneralPath) shape).curveTo(201.45265, 182.20192, 201.58546, 184.43336, 201.57326, 184.48268);
        ((GeneralPath) shape).curveTo(201.31105, 185.5447, 200.42043, 187.00856, 199.95314, 188.03151);
        ((GeneralPath) shape).curveTo(199.81984, 188.32399, 199.9424, 188.58473, 199.88234, 188.8816);
        ((GeneralPath) shape).curveTo(199.84523, 189.0652, 199.44875, 190.22145, 199.45314, 190.30153);
        ((GeneralPath) shape).curveTo(199.51662, 191.4651, 199.94337, 192.89088, 200.1631, 194.05153);
        ((GeneralPath) shape).lineTo(201.22316, 195.05153);
        ((GeneralPath) shape).curveTo(201.0215, 195.33766, 200.67775, 196.08766, 200.73195, 196.46169);
        ((GeneralPath) shape).curveTo(201.87257, 197.24, 204.46925, 198.5237, 205.83302, 198.6614);
        ((GeneralPath) shape).curveTo(205.81007, 200.57301, 205.86427, 202.4905, 205.90236, 204.40163);
        ((GeneralPath) shape).lineTo(208.03322, 204.82155);
        ((GeneralPath) shape).curveTo(208.0591, 205.64723, 208.01613, 210.49489, 207.82326, 211.07155);
        ((GeneralPath) shape).curveTo(206.84914, 211.50221, 205.54543, 211.67604, 204.49318, 211.70143);
        ((GeneralPath) shape).curveTo(204.67336, 212.03346, 205.84572, 214.21022, 205.7632, 214.39284);
        ((GeneralPath) shape).lineTo(205.7632, 215.03151);
        ((GeneralPath) shape).curveTo(205.73976, 215.15797, 205.32521, 215.42848, 205.19191, 215.45143);
        ((GeneralPath) shape).lineTo(202.64308, 215.89284);
        ((GeneralPath) shape).curveTo(202.95753, 218.04811, 203.3174, 220.18971, 203.70314, 222.3318);
        ((GeneralPath) shape).curveTo(204.21584, 225.178, 204.90138, 226.02956, 206.53322, 228.43239);
        ((GeneralPath) shape).curveTo(207.63722, 230.05788, 208.8047, 231.62477, 210.0132, 233.17165);
        ((GeneralPath) shape).curveTo(211.98244, 230.91383, 213.96877, 228.6692, 215.97316, 226.44266);
        ((GeneralPath) shape).curveTo(215.92677, 226.33376, 216.11086, 226.2532, 216.18312, 226.2327);
        ((GeneralPath) shape).curveTo(216.48683, 225.12917, 220.33693, 223.78494, 221.28322, 223.6824);
        ((GeneralPath) shape).curveTo(222.16115, 223.58768, 223.09767, 223.61746, 223.97218, 223.75174);
        ((GeneralPath) shape).curveTo(224.6426, 223.85477, 225.29836, 224.40018, 225.8921, 224.74149);
        ((GeneralPath) shape).curveTo(226.48341, 226.97244, 225.2881, 227.02129, 227.37306, 229.06277);
        ((GeneralPath) shape).lineTo(227.58302, 229.56277);
        ((GeneralPath) shape).curveTo(227.38281, 229.74834, 227.1797, 230.38895, 227.23195, 230.62137);
        ((GeneralPath) shape).curveTo(227.23195, 230.62137, 227.51222, 231.00662, 227.58302, 231.12137);
        ((GeneralPath) shape).lineTo(227.87306, 231.27274);
        ((GeneralPath) shape).curveTo(228.05959, 231.3157, 228.34425, 231.31277, 228.44191, 231.40166);
        ((GeneralPath) shape).lineTo(228.65187, 231.5418);
        ((GeneralPath) shape).lineTo(229.36232, 231.0418);
        ((GeneralPath) shape).curveTo(229.49123, 231.20927, 229.74953, 231.32597, 229.85207, 231.48271);
        ((GeneralPath) shape).curveTo(230.23634, 232.07011, 233.5171, 236.93095, 233.69191, 237.42168);
        ((GeneralPath) shape).curveTo(233.95168, 238.15019, 234.01271, 239.13406, 234.18214, 239.90166);
        ((GeneralPath) shape).curveTo(234.62941, 241.92802, 235.08937, 244.00906, 235.67236, 246.00175);
        ((GeneralPath) shape).curveTo(236.19238, 247.77661, 237.47266, 250.32593, 238.22754, 252.09302);
        ((GeneralPath) shape).closePath();
        
        // transformieren:
        Shape newShape = transformiere(shape);
        return  newShape;
    }
}
