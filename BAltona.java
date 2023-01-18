import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

/**
 * Ein BAltona, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author  Torsten Otto
 * @version 10/2022
 */
public class BAltona extends Element
{

    /**
     * Erzeuge einen neuen BAltona mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public BAltona() {
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

                ((GeneralPath) shape).moveTo(38.021, 269.95142);
        ((GeneralPath) shape).curveTo(38.39795, 269.11157, 40.11475, 266.95288, 40.70313, 266.06274);
        ((GeneralPath) shape).curveTo(51.94434, 268.34497, 63.11036, 270.91333, 74.21192, 273.79126);
        ((GeneralPath) shape).curveTo(80.16504, 275.33472, 86.08301, 277.04126, 92.01319, 278.67212);
        ((GeneralPath) shape).curveTo(97.84913, 280.2766, 103.57227, 281.69263, 109.51319, 282.85278);
        ((GeneralPath) shape).curveTo(111.14649, 283.17163, 112.77637, 283.4734, 114.41309, 283.7727);
        ((GeneralPath) shape).curveTo(116.21436, 284.1018, 117.99219, 284.63696, 119.79297, 284.98267);
        ((GeneralPath) shape).curveTo(126.54981, 286.28052, 133.71143, 286.04517, 140.55322, 286.67212);
        ((GeneralPath) shape).curveTo(143.51514, 286.9436, 146.45166, 287.26245, 149.4248, 287.42358);
        ((GeneralPath) shape).curveTo(158.32324, 287.90552, 167.24414, 287.62622, 176.13232, 287.07007);
        ((GeneralPath) shape).curveTo(179.56883, 286.85474, 183.06104, 286.698, 186.48193, 286.32153);
        ((GeneralPath) shape).curveTo(186.61328, 286.3069, 186.854, 286.23264, 186.98193, 286.1926);
        ((GeneralPath) shape).curveTo(190.5166, 285.07983, 192.74463, 283.31323, 196.90234, 283.13303);
        ((GeneralPath) shape).curveTo(196.86131, 282.4963, 196.78955, 279.9797, 196.6123, 279.5227);
        ((GeneralPath) shape).lineTo(194.99316, 279.88303);
        ((GeneralPath) shape).lineTo(194.49316, 279.73264);
        ((GeneralPath) shape).curveTo(194.5205, 279.57297, 194.30469, 278.45532, 194.2832, 278.2512);
        ((GeneralPath) shape).curveTo(194.18262, 278.2844, 194.08154, 278.3337, 193.99316, 278.3928);
        ((GeneralPath) shape).curveTo(193.96094, 278.27414, 193.92139, 278.14963, 193.8623, 278.04123);
        ((GeneralPath) shape).lineTo(194.07324, 277.8215);
        ((GeneralPath) shape).curveTo(193.93896, 277.78098, 192.55371, 277.03146, 192.51318, 276.90158);
        ((GeneralPath) shape).curveTo(192.8169, 276.12424, 192.98096, 275.50314, 192.8623, 274.63303);
        ((GeneralPath) shape).lineTo(193.2832, 274.63303);
        ((GeneralPath) shape).lineTo(193.2832, 274.4221);
        ((GeneralPath) shape).curveTo(193.54248, 270.90063, 194.72363, 267.3259, 195.56006, 263.9055);
        ((GeneralPath) shape).curveTo(195.87793, 262.60617, 196.07324, 261.26047, 196.40234, 259.97287);
        ((GeneralPath) shape).curveTo(196.44044, 259.82443, 196.5039, 259.67648, 196.55322, 259.53146);
        ((GeneralPath) shape).curveTo(197.20705, 260.0842, 197.82082, 260.67648, 198.46191, 261.24142);
        ((GeneralPath) shape).curveTo(199.7217, 262.3508, 200.3584, 262.60666, 200.4419, 264.35275);
        ((GeneralPath) shape).lineTo(202.8623, 263.93283);
        ((GeneralPath) shape).curveTo(202.67188, 262.5759, 202.61523, 261.18674, 202.50195, 259.8215);
        ((GeneralPath) shape).lineTo(202.71191, 259.8928);
        ((GeneralPath) shape).lineTo(202.8623, 259.3928);
        ((GeneralPath) shape).lineTo(203.2832, 259.47287);
        ((GeneralPath) shape).lineTo(203.57326, 258.47287);
        ((GeneralPath) shape).lineTo(202.99316, 258.33127);
        ((GeneralPath) shape).lineTo(203.57326, 256.49146);
        ((GeneralPath) shape).lineTo(201.72314, 256.63303);
        ((GeneralPath) shape).curveTo(201.51562, 256.20825, 201.35547, 255.61888, 201.3623, 255.1428);
        ((GeneralPath) shape).lineTo(205.47314, 254.93285);
        ((GeneralPath) shape).lineTo(205.47314, 255.49144);
        ((GeneralPath) shape).curveTo(205.70753, 255.41283, 206.02148, 255.41478, 206.26318, 255.43285);
        ((GeneralPath) shape).lineTo(206.26318, 254.78148);
        ((GeneralPath) shape).curveTo(207.667, 254.77171, 209.0498, 254.66966, 210.45412, 254.60081);
        ((GeneralPath) shape).lineTo(210.79298, 253.94263);
        ((GeneralPath) shape).lineTo(210.43312, 253.80296);
        ((GeneralPath) shape).curveTo(210.18703, 254.08813, 208.4629, 254.02074, 207.95314, 253.87132);
        ((GeneralPath) shape).curveTo(208.24855, 253.67455, 208.71437, 252.89429, 208.88234, 252.59302);
        ((GeneralPath) shape).lineTo(204.98195, 249.61156);
        ((GeneralPath) shape).curveTo(203.33107, 250.15355, 201.75685, 252.49046, 201.0132, 252.9514);
        ((GeneralPath) shape).curveTo(199.667, 253.78539, 197.96193, 254.45189, 196.48195, 255.01292);
        ((GeneralPath) shape).curveTo(196.37794, 254.86449, 196.2046, 254.74535, 196.05324, 254.6516);
        ((GeneralPath) shape).curveTo(195.97658, 254.426, 195.90187, 254.14427, 195.77199, 253.94261);
        ((GeneralPath) shape).lineTo(195.55324, 254.01292);
        ((GeneralPath) shape).curveTo(194.18068, 253.05638, 191.6587, 251.44994, 190.38234, 251.11156);
        ((GeneralPath) shape).lineTo(190.09328, 250.96117);
        ((GeneralPath) shape).curveTo(189.47853, 250.42941, 187.9883, 247.3142, 187.69191, 246.78146);
        ((GeneralPath) shape).lineTo(186.84328, 246.42162);
        ((GeneralPath) shape).curveTo(186.80763, 246.26292, 186.45558, 245.91966, 186.34328, 245.79173);
        ((GeneralPath) shape).curveTo(185.19923, 245.07835, 184.42336, 243.9553, 183.36232, 243.4514);
        ((GeneralPath) shape).lineTo(183.08302, 243.59154);
        ((GeneralPath) shape).curveTo(183.1299, 243.69066, 183.17433, 243.8308, 183.15236, 243.94261);
        ((GeneralPath) shape).curveTo(183.14552, 244.41722, 183.26955, 245.9348, 183.23195, 246.5017);
        ((GeneralPath) shape).lineTo(182.37306, 246.42162);
        ((GeneralPath) shape).curveTo(182.4673, 245.31271, 181.31349, 244.04369, 180.75197, 243.24142);
        ((GeneralPath) shape).curveTo(179.69386, 243.4099, 178.54982, 243.31271, 177.48195, 243.31271);
        ((GeneralPath) shape).curveTo(176.855, 243.31271, 176.07765, 243.63351, 175.43312, 243.73264);
        ((GeneralPath) shape).curveTo(175.10109, 243.7839, 174.69923, 243.6511, 174.37306, 243.59154);
        ((GeneralPath) shape).curveTo(173.97755, 242.76585, 173.47316, 241.70042, 172.813, 241.04173);
        ((GeneralPath) shape).curveTo(172.57082, 240.99437, 171.82765, 241.41917, 171.60304, 241.54173);
        ((GeneralPath) shape).curveTo(169.51076, 239.09789, 167.4673, 236.53929, 165.29298, 234.17162);
        ((GeneralPath) shape).curveTo(164.48439, 233.29124, 160.90138, 230.50021, 160.47316, 229.27267);
        ((GeneralPath) shape).curveTo(160.23976, 228.60373, 160.35207, 227.48752, 160.2632, 226.73264);
        ((GeneralPath) shape).curveTo(160.20168, 226.20627, 159.89113, 225.82738, 159.70314, 225.3713);
        ((GeneralPath) shape).curveTo(158.9551, 223.55392, 158.7217, 222.0261, 158.84328, 219.93234);
        ((GeneralPath) shape).lineTo(157.57326, 219.78146);
        ((GeneralPath) shape).curveTo(157.36134, 219.27316, 157.48146, 218.35422, 157.70314, 217.8713);
        ((GeneralPath) shape).lineTo(157.14308, 217.16135);
        ((GeneralPath) shape).lineTo(156.86232, 217.01144);
        ((GeneralPath) shape).curveTo(156.23781, 216.90793, 152.54445, 217.9885, 151.2632, 217.93234);
        ((GeneralPath) shape).curveTo(150.8716, 218.83958, 151.12843, 220.57835, 151.11232, 221.48264);
        ((GeneralPath) shape).curveTo(151.10646, 221.81516, 151.61232, 223.04172, 151.61232, 223.04172);
        ((GeneralPath) shape).curveTo(151.48732, 223.0134, 149.78029, 223.41867, 149.55324, 223.54172);
        ((GeneralPath) shape).curveTo(149.34718, 223.17014, 148.2505, 221.84396, 148.35304, 221.41135);
        ((GeneralPath) shape).curveTo(147.98293, 221.45676, 147.29689, 221.30441, 146.93312, 221.27267);
        ((GeneralPath) shape).curveTo(146.39796, 220.55392, 146.44191, 218.81078, 146.44191, 218.01144);
        ((GeneralPath) shape).curveTo(146.38039, 217.86838, 146.33107, 217.7756, 146.30324, 217.7224);
        ((GeneralPath) shape).curveTo(145.89943, 217.01682, 145.71779, 216.26048, 145.30324, 215.81271);
        ((GeneralPath) shape).lineTo(144.80324, 215.45139);
        ((GeneralPath) shape).curveTo(144.80275, 214.59103, 145.14943, 213.94553, 145.24318, 213.1213);
        ((GeneralPath) shape).curveTo(145.45607, 211.25314, 145.20705, 209.3547, 144.74318, 207.53146);
        ((GeneralPath) shape).lineTo(145.24318, 207.38158);
        ((GeneralPath) shape).curveTo(145.04787, 207.25755, 142.38087, 205.41525, 142.32326, 205.4016);
        ((GeneralPath) shape).curveTo(142.40529, 205.15404, 142.53322, 204.9055, 142.68312, 204.69261);
        ((GeneralPath) shape).curveTo(140.61232, 203.42015, 138.57228, 202.09691, 136.52199, 200.79173);
        ((GeneralPath) shape).curveTo(136.46242, 200.75365, 136.3047, 200.74828, 136.23195, 200.7224);
        ((GeneralPath) shape).curveTo(134.51027, 200.10764, 127.97756, 195.44553, 126.52199, 194.05148);
        ((GeneralPath) shape).curveTo(125.7051, 193.26878, 124.95363, 192.44894, 124.19191, 191.6516);
        ((GeneralPath) shape).curveTo(122.80714, 190.20238, 118.83937, 186.38058, 117.88869, 184.98264);
        ((GeneralPath) shape).curveTo(117.99514, 186.38205, 116.95851, 189.37279, 117.45314, 190.3713);
        ((GeneralPath) shape).lineTo(111.93312, 193.56271);
        ((GeneralPath) shape).curveTo(111.8633, 193.83273, 111.18605, 196.5256, 111.14308, 196.61156);
        ((GeneralPath) shape).curveTo(110.49562, 197.91576, 109.28273, 199.35033, 108.45314, 200.5715);
        ((GeneralPath) shape).lineTo(108.74318, 204.8215);
        ((GeneralPath) shape).curveTo(108.57668, 205.27853, 105.12599, 206.02463, 104.4131, 207.59154);
        ((GeneralPath) shape).lineTo(101.29298, 207.09154);
        ((GeneralPath) shape).lineTo(101.57325, 207.66135);
        ((GeneralPath) shape).curveTo(100.15235, 208.31711, 98.54737, 208.59154, 97.11231, 209.2224);
        ((GeneralPath) shape).lineTo(97.61231, 211.42162);
        ((GeneralPath) shape).lineTo(93.28321, 211.42162);
        ((GeneralPath) shape).curveTo(93.21729, 211.60912, 92.81544, 212.62766, 92.86231, 212.76144);
        ((GeneralPath) shape).curveTo(92.94043, 212.87572, 93.40821, 213.35081, 93.43311, 213.55148);
        ((GeneralPath) shape).curveTo(93.46094, 213.96458, 93.39014, 214.40842, 93.36231, 214.8215);
        ((GeneralPath) shape).lineTo(93.07325, 214.8928);
        ((GeneralPath) shape).curveTo(92.98487, 214.93771, 92.95069, 214.7766, 92.78321, 214.74142);
        ((GeneralPath) shape).lineTo(92.36231, 214.8928);
        ((GeneralPath) shape).lineTo(91.80323, 215.45139);
        ((GeneralPath) shape).lineTo(91.09327, 215.53146);
        ((GeneralPath) shape).lineTo(89.95313, 218.79172);
        ((GeneralPath) shape).lineTo(90.73194, 219.5715);
        ((GeneralPath) shape).curveTo(90.73194, 222.10912, 91.20704, 220.94894, 90.09327, 222.05148);
        ((GeneralPath) shape).curveTo(90.09327, 222.05148, 89.6377, 222.15697, 89.53321, 222.1926);
        ((GeneralPath) shape).curveTo(89.12061, 222.33273, 88.42139, 222.34543, 87.97315, 222.41135);
        ((GeneralPath) shape).curveTo(87.01514, 224.0593, 83.35694, 225.46408, 81.59327, 225.3713);
        ((GeneralPath) shape).lineTo(80.313, 227.01144);
        ((GeneralPath) shape).curveTo(79.50441, 226.8298, 78.27052, 226.42795, 77.62306, 225.8713);
        ((GeneralPath) shape).lineTo(77.62306, 225.66135);
        ((GeneralPath) shape).curveTo(76.34962, 224.92746, 73.91163, 224.28098, 73.02199, 223.68234);
        ((GeneralPath) shape).curveTo(72.89553, 223.5974, 71.94338, 222.4558, 71.73195, 222.26144);
        ((GeneralPath) shape).curveTo(71.62843, 222.16624, 71.26613, 222.07687, 71.17189, 221.98264);
        ((GeneralPath) shape).curveTo(69.40431, 220.21457, 67.56544, 218.48264, 65.85304, 216.66135);
        ((GeneralPath) shape).curveTo(65.82325, 216.6965, 65.45753, 216.29416, 65.43312, 216.24142);
        ((GeneralPath) shape).curveTo(65.27003, 215.88889, 65.09083, 215.34154, 64.87306, 215.03146);
        ((GeneralPath) shape).curveTo(64.73536, 214.83517, 63.64015, 213.9006, 63.23195, 213.33176);
        ((GeneralPath) shape).lineTo(63.10304, 213.68234);
        ((GeneralPath) shape).lineTo(62.45314, 214.18234);
        ((GeneralPath) shape).curveTo(62.39943, 214.13206, 62.12404, 213.75072, 62.10304, 213.68234);
        ((GeneralPath) shape).curveTo(61.87111, 213.62083, 61.18312, 212.70139, 61.18312, 212.70139);
        ((GeneralPath) shape).curveTo(60.98683, 212.42453, 60.87648, 211.98119, 60.47316, 211.78146);
        ((GeneralPath) shape).curveTo(60.39601, 211.60422, 60.34035, 211.64085, 60.18312, 211.42162);
        ((GeneralPath) shape).curveTo(59.99953, 211.46654, 59.46486, 211.05931, 59.19191, 210.85275);
        ((GeneralPath) shape).curveTo(59.13039, 210.88693, 58.76955, 210.635, 58.56203, 210.5715);
        ((GeneralPath) shape).curveTo(58.49465, 210.49924, 58.41115, 210.44212, 58.35305, 210.36156);
        ((GeneralPath) shape).lineTo(57.91311, 210.2224);
        ((GeneralPath) shape).lineTo(57.21194, 210.2224);
        ((GeneralPath) shape).lineTo(57.14309, 209.1516);
        ((GeneralPath) shape).curveTo(55.38284, 207.19798, 53.77004, 205.08517, 52.10305, 203.05148);
        ((GeneralPath) shape).curveTo(51.6553, 202.5051, 50.77493, 199.70872, 50.47317, 198.88158);
        ((GeneralPath) shape).lineTo(52.32327, 198.45139);
        ((GeneralPath) shape).lineTo(52.32327, 197.38158);
        ((GeneralPath) shape).lineTo(56.64309, 196.4016);
        ((GeneralPath) shape).lineTo(58.06204, 193.13158);
        ((GeneralPath) shape).curveTo(57.35892, 192.10716, 56.17386, 190.79562, 55.72317, 189.66136);
        ((GeneralPath) shape).lineTo(51.61233, 192.0017);
        ((GeneralPath) shape).curveTo(50.95608, 191.33812, 50.36087, 190.4763, 49.91311, 189.66136);
        ((GeneralPath) shape).curveTo(49.69387, 189.44359, 49.62307, 189.17162, 49.62307, 189.17162);
        ((GeneralPath) shape).curveTo(49.59817, 188.95187, 49.66604, 188.67747, 49.70315, 188.46165);
        ((GeneralPath) shape).curveTo(46.46536, 188.18822, 45.72366, 187.25462, 42.82327, 185.77269);
        ((GeneralPath) shape).curveTo(39.93118, 184.29515, 36.91751, 182.99828, 33.96194, 181.6516);
        ((GeneralPath) shape).lineTo(32.55325, 174.56273);
        ((GeneralPath) shape).curveTo(32.51346, 174.35912, 32.10867, 172.29857, 32.11258, 172.2224);
        ((GeneralPath) shape).curveTo(32.17972, 170.86449, 32.8616, 169.1272, 33.11258, 167.7014);
        ((GeneralPath) shape).lineTo(34.46195, 160.03148);
        ((GeneralPath) shape).lineTo(34.10038, 159.72484);
        ((GeneralPath) shape).lineTo(33.04008, 165.17601);
        ((GeneralPath) shape).lineTo(27.94218, 165.49144);
        ((GeneralPath) shape).lineTo(27.73197, 169.04173);
        ((GeneralPath) shape).lineTo(24.75223, 169.8928);
        ((GeneralPath) shape).lineTo(23.33206, 177.33176);
        ((GeneralPath) shape).curveTo(23.13992, 178.33957, 23.10574, 179.48117, 22.77322, 180.45139);
        ((GeneralPath) shape).curveTo(22.59134, 180.98264, 22.22976, 181.57101, 21.98196, 182.08176);
        ((GeneralPath) shape).lineTo(21.35305, 181.9426);
        ((GeneralPath) shape).lineTo(20.71194, 183.56271);
        ((GeneralPath) shape).lineTo(20.36257, 183.35275);
        ((GeneralPath) shape).lineTo(19.23195, 186.1213);
        ((GeneralPath) shape).curveTo(20.12697, 186.5261, 20.98366, 187.06711, 21.84352, 187.54172);
        ((GeneralPath) shape).lineTo(21.63234, 187.8215);
        ((GeneralPath) shape).lineTo(24.19215, 189.17162);
        ((GeneralPath) shape).lineTo(21.21193, 201.21165);
        ((GeneralPath) shape).curveTo(19.13551, 200.6555, 17.02321, 200.16039, 14.97316, 199.51144);
        ((GeneralPath) shape).curveTo(14.65968, 200.47678, 14.39699, 201.6467, 13.98195, 202.56271);
        ((GeneralPath) shape).curveTo(12.92946, 204.88644, 10.86232, 207.01682, 11.07326, 209.78146);
        ((GeneralPath) shape).curveTo(11.07888, 209.85422, 11.62624, 212.30344, 11.64333, 212.34154);
        ((GeneralPath) shape).curveTo(12.10476, 213.38206, 13.01394, 214.55003, 13.62307, 215.53146);
        ((GeneralPath) shape).lineTo(12.70315, 220.20139);
        ((GeneralPath) shape).lineTo(12.91336, 220.77267);
        ((GeneralPath) shape).curveTo(11.33597, 220.77267, 12.41385, 220.49142, 11.35306, 220.49142);
        ((GeneralPath) shape).lineTo(11.14334, 220.28146);
        ((GeneralPath) shape).curveTo(10.74734, 220.18333, 10.71414, 220.53976, 10.50223, 220.77267);
        ((GeneralPath) shape).curveTo(10.77811, 221.64914, 4.71805, 227.94164, 3.70316, 230.41135);
        ((GeneralPath) shape).curveTo(5.0225, 231.07932, 5.80472, 232.57101, 6.10306, 233.96164);
        ((GeneralPath) shape).lineTo(7.25296, 233.75168);
        ((GeneralPath) shape).lineTo(7.46194, 232.11154);
        ((GeneralPath) shape).lineTo(8.45315, 231.90158);
        ((GeneralPath) shape).curveTo(9.04592, 233.43283, 9.61428, 235.03683, 10.36257, 236.50168);
        ((GeneralPath) shape).curveTo(9.95144, 236.5007, 8.69973, 236.51926, 8.37307, 236.65158);
        ((GeneralPath) shape).lineTo(8.52322, 237.00168);
        ((GeneralPath) shape).curveTo(8.52322, 237.00168, 7.91458, 237.24094, 7.74343, 237.29172);
        ((GeneralPath) shape).curveTo(7.47317, 237.238, 7.13967, 237.34396, 6.81203, 237.29172);
        ((GeneralPath) shape).curveTo(6.60353, 237.25851, 6.39406, 237.19894, 6.18337, 237.21164);
        ((GeneralPath) shape).lineTo(5.75295, 237.71164);
        ((GeneralPath) shape).lineTo(5.47314, 237.71164);
        ((GeneralPath) shape).curveTo(5.31567, 238.56711, 4.74292, 239.11447, 4.83203, 240.05148);
        ((GeneralPath) shape).lineTo(5.89331, 240.75168);
        ((GeneralPath) shape).curveTo(5.51685, 242.62033, 5.16504, 244.49875, 4.76343, 246.36154);
        ((GeneralPath) shape).curveTo(4.45679, 247.78342, 4.10181, 248.99924, 4.06201, 250.47287);
        ((GeneralPath) shape).curveTo(4.04223, 251.21506, 4.52905, 253.46652, 4.41333, 253.80295);
        ((GeneralPath) shape).curveTo(3.03491, 257.8093, 1.6687, 261.81857, 0.37305, 265.85275);
        ((GeneralPath) shape).curveTo(9.66211, 267.13644, 19.0376, 267.92502, 28.36255, 268.8928);
        ((GeneralPath) shape).curveTo(28.36255, 268.8928, 30.10767, 269.81223, 30.13233, 269.8127);
        ((GeneralPath) shape).lineTo(38.021, 269.95142);
        ((GeneralPath) shape).closePath();
        
        // transformieren:
        Shape newShape = transformiere(shape);
        return  newShape;
    }

}
