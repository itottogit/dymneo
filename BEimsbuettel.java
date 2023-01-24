import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

/**
 * Ein BEimsbuettel, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author  Torsten Otto
 * @version 10/2022
 */
public class BEimsbuettel extends Bezirk
{

    /**
     * Erzeuge einen neuen BEimsbuettel mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public BEimsbuettel() {
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
        ((GeneralPath) shape).curveTo(235.02686, 255.78394, 231.02979, 259.89087, 228.29297, 263.86157);
        ((GeneralPath) shape).curveTo(225.79004, 262.86646, 224.1372, 262.30347, 222.49316, 260.0315);
        ((GeneralPath) shape).curveTo(222.06496, 259.4392, 221.64796, 258.40503, 221.14307, 257.9729);
        ((GeneralPath) shape).lineTo(218.09328, 255.36157);
        ((GeneralPath) shape).curveTo(217.83643, 255.14136, 217.563, 255.04517, 217.313, 254.7815);
        ((GeneralPath) shape).curveTo(215.20216, 254.15112, 212.63281, 254.54126, 210.45412, 254.60083);
        ((GeneralPath) shape).lineTo(210.79298, 253.94263);
        ((GeneralPath) shape).lineTo(210.43312, 253.80298);
        ((GeneralPath) shape).curveTo(210.18703, 254.08813, 208.4629, 254.02075, 207.95314, 253.87134);
        ((GeneralPath) shape).curveTo(208.24855, 253.67456, 208.71437, 252.89429, 208.88234, 252.59302);
        ((GeneralPath) shape).lineTo(204.98195, 249.61157);
        ((GeneralPath) shape).curveTo(203.33107, 250.15356, 201.75685, 252.49048, 201.0132, 252.95142);
        ((GeneralPath) shape).curveTo(199.667, 253.78539, 197.96193, 254.4519, 196.48195, 255.01292);
        ((GeneralPath) shape).curveTo(196.37794, 254.86449, 196.2046, 254.74535, 196.05324, 254.6516);
        ((GeneralPath) shape).curveTo(195.97658, 254.42601, 195.90187, 254.14429, 195.77199, 253.94263);
        ((GeneralPath) shape).lineTo(195.55324, 254.01292);
        ((GeneralPath) shape).curveTo(194.18068, 253.0564, 191.6587, 251.44994, 190.38234, 251.11156);
        ((GeneralPath) shape).lineTo(190.09328, 250.96117);
        ((GeneralPath) shape).curveTo(189.47853, 250.42943, 187.9883, 247.3142, 187.69191, 246.78148);
        ((GeneralPath) shape).lineTo(186.84328, 246.42162);
        ((GeneralPath) shape).curveTo(186.80763, 246.26292, 186.45558, 245.91966, 186.34328, 245.79173);
        ((GeneralPath) shape).curveTo(185.19923, 245.07835, 184.42336, 243.9553, 183.36232, 243.45142);
        ((GeneralPath) shape).lineTo(183.08302, 243.59155);
        ((GeneralPath) shape).curveTo(183.1299, 243.69067, 183.17433, 243.83081, 183.15236, 243.94263);
        ((GeneralPath) shape).curveTo(183.14552, 244.41724, 183.26955, 245.93481, 183.23195, 246.5017);
        ((GeneralPath) shape).lineTo(182.37306, 246.42162);
        ((GeneralPath) shape).curveTo(182.4673, 245.31273, 181.31349, 244.04369, 180.75197, 243.24144);
        ((GeneralPath) shape).curveTo(179.69386, 243.4099, 178.54982, 243.31273, 177.48195, 243.31273);
        ((GeneralPath) shape).curveTo(176.855, 243.31273, 176.07765, 243.63353, 175.43312, 243.73265);
        ((GeneralPath) shape).curveTo(175.10109, 243.78392, 174.69923, 243.65111, 174.37306, 243.59154);
        ((GeneralPath) shape).curveTo(173.97755, 242.76585, 173.47316, 241.70042, 172.813, 241.04173);
        ((GeneralPath) shape).curveTo(172.57082, 240.99438, 171.82765, 241.41917, 171.60304, 241.54173);
        ((GeneralPath) shape).curveTo(169.51076, 239.09789, 167.4673, 236.5393, 165.29298, 234.17162);
        ((GeneralPath) shape).curveTo(164.48439, 233.29124, 160.90138, 230.50023, 160.47316, 229.27269);
        ((GeneralPath) shape).curveTo(160.23976, 228.60374, 160.35207, 227.48753, 160.2632, 226.73265);
        ((GeneralPath) shape).curveTo(160.20168, 226.20628, 159.89113, 225.82738, 159.70314, 225.37132);
        ((GeneralPath) shape).curveTo(158.9551, 223.55394, 158.7217, 222.02611, 158.84328, 219.93236);
        ((GeneralPath) shape).lineTo(157.57326, 219.78148);
        ((GeneralPath) shape).curveTo(157.36134, 219.27318, 157.48146, 218.35423, 157.70314, 217.87132);
        ((GeneralPath) shape).lineTo(157.14308, 217.16136);
        ((GeneralPath) shape).lineTo(156.86232, 217.01146);
        ((GeneralPath) shape).curveTo(156.23781, 216.90794, 152.54445, 217.98851, 151.2632, 217.93236);
        ((GeneralPath) shape).curveTo(150.8716, 218.83958, 151.12843, 220.57835, 151.11232, 221.48265);
        ((GeneralPath) shape).curveTo(151.10646, 221.81517, 151.61232, 223.04173, 151.61232, 223.04173);
        ((GeneralPath) shape).curveTo(151.48732, 223.01341, 149.78029, 223.41869, 149.55324, 223.54173);
        ((GeneralPath) shape).curveTo(149.34718, 223.17015, 148.2505, 221.84398, 148.35304, 221.41136);
        ((GeneralPath) shape).curveTo(147.98293, 221.45677, 147.29689, 221.30443, 146.93312, 221.27269);
        ((GeneralPath) shape).curveTo(146.39796, 220.55394, 146.44191, 218.81078, 146.44191, 218.01146);
        ((GeneralPath) shape).curveTo(146.38039, 217.8684, 146.33107, 217.77562, 146.30324, 217.7224);
        ((GeneralPath) shape).curveTo(145.89943, 217.01683, 145.71779, 216.26048, 145.30324, 215.81273);
        ((GeneralPath) shape).lineTo(144.80324, 215.4514);
        ((GeneralPath) shape).curveTo(144.80275, 214.59105, 145.14943, 213.94554, 145.24318, 213.12132);
        ((GeneralPath) shape).curveTo(145.45607, 211.25316, 145.20705, 209.35472, 144.74318, 207.53148);
        ((GeneralPath) shape).lineTo(145.24318, 207.38158);
        ((GeneralPath) shape).curveTo(145.04787, 207.25755, 142.38087, 205.41527, 142.32326, 205.4016);
        ((GeneralPath) shape).curveTo(142.40529, 205.15404, 142.53322, 204.90552, 142.68312, 204.69263);
        ((GeneralPath) shape).curveTo(140.61232, 203.42017, 138.57228, 202.09692, 136.52199, 200.79173);
        ((GeneralPath) shape).curveTo(136.46242, 200.75365, 136.3047, 200.74828, 136.23195, 200.7224);
        ((GeneralPath) shape).curveTo(134.51027, 200.10765, 127.97756, 195.44554, 126.52199, 194.0515);
        ((GeneralPath) shape).curveTo(125.7051, 193.26878, 124.95363, 192.44896, 124.19191, 191.6516);
        ((GeneralPath) shape).curveTo(122.80714, 190.20238, 118.83937, 186.3806, 117.88869, 184.98265);
        ((GeneralPath) shape).lineTo(117.95314, 184.48265);
        ((GeneralPath) shape).curveTo(119.89601, 182.07933, 124.21584, 177.17992, 126.52199, 175.41136);
        ((GeneralPath) shape).curveTo(127.13625, 174.94066, 127.90334, 174.52855, 128.58302, 174.1428);
        ((GeneralPath) shape).lineTo(128.79298, 174.49144);
        ((GeneralPath) shape).curveTo(129.51906, 173.82689, 130.46095, 172.73705, 131.27199, 172.2224);
        ((GeneralPath) shape).curveTo(131.71437, 171.94164, 134.7676, 171.40552, 135.59328, 171.16136);
        ((GeneralPath) shape).curveTo(134.30177, 170.56126, 133.0425, 168.635, 132.27199, 168.33177);
        ((GeneralPath) shape).curveTo(132.62941, 167.16185, 133.20753, 166.09544, 133.75197, 164.99144);
        ((GeneralPath) shape).lineTo(133.82326, 164.78148);
        ((GeneralPath) shape).curveTo(133.88283, 164.66624, 134.20216, 164.24779, 134.25197, 164.29173);
        ((GeneralPath) shape).curveTo(135.98586, 162.90501, 137.87648, 161.07298, 139.42189, 159.4724);
        ((GeneralPath) shape).lineTo(139.36232, 159.05148);
        ((GeneralPath) shape).curveTo(139.67238, 158.9094, 140.14455, 158.9592, 140.48195, 158.9016);
        ((GeneralPath) shape).curveTo(140.37746, 157.03001, 140.89552, 155.44308, 141.34328, 153.66136);
        ((GeneralPath) shape).curveTo(141.84816, 153.34789, 144.0713, 151.68578, 144.32326, 151.61156);
        ((GeneralPath) shape).curveTo(144.33888, 151.24193, 144.5215, 149.53734, 144.45314, 149.27269);
        ((GeneralPath) shape).curveTo(144.1963, 148.27513, 143.50539, 147.1516, 143.74318, 146.08177);
        ((GeneralPath) shape).curveTo(145.36281, 145.05247, 147.09181, 144.15355, 148.78322, 143.2517);
        ((GeneralPath) shape).curveTo(148.77687, 142.31273, 148.70314, 141.3723, 148.70314, 140.41136);
        ((GeneralPath) shape).curveTo(148.8462, 140.08421, 148.43117, 139.00609, 148.35304, 138.77269);
        ((GeneralPath) shape).lineTo(148.78322, 138.29173);
        ((GeneralPath) shape).lineTo(148.42189, 137.36156);
        ((GeneralPath) shape).lineTo(147.64308, 137.2224);
        ((GeneralPath) shape).curveTo(147.87697, 136.7551, 148.09279, 136.26488, 148.35304, 135.81271);
        ((GeneralPath) shape).lineTo(148.07326, 135.45139);
        ((GeneralPath) shape).lineTo(148.42188, 132.8928);
        ((GeneralPath) shape).lineTo(148.63232, 132.8928);
        ((GeneralPath) shape).lineTo(148.7832, 130.62132);
        ((GeneralPath) shape).lineTo(149.34328, 130.49144);
        ((GeneralPath) shape).curveTo(149.30714, 129.75072, 149.57275, 128.968, 149.13332, 128.29173);
        ((GeneralPath) shape).curveTo(149.44435, 127.97142, 151.2505, 127.61937, 151.55322, 127.66136);
        ((GeneralPath) shape).lineTo(151.82326, 128.08177);
        ((GeneralPath) shape).lineTo(152.6123, 127.93236);
        ((GeneralPath) shape).lineTo(152.6831, 128.1428);
        ((GeneralPath) shape).lineTo(153.74316, 127.93236);
        ((GeneralPath) shape).lineTo(154.30322, 127.7224);
        ((GeneralPath) shape).curveTo(154.68262, 127.71801, 155.32423, 127.48021, 155.37305, 127.37133);
        ((GeneralPath) shape).curveTo(155.67188, 127.22387, 155.82959, 127.06469, 156.01318, 126.95141);
        ((GeneralPath) shape).lineTo(155.87305, 126.66137);
        ((GeneralPath) shape).curveTo(156.04541, 126.16381, 155.9497, 125.50561, 156.08301, 124.95141);
        ((GeneralPath) shape).lineTo(158.56299, 125.88159);
        ((GeneralPath) shape).lineTo(158.91309, 125.31274);
        ((GeneralPath) shape).lineTo(159.62305, 125.24145);
        ((GeneralPath) shape).curveTo(159.87695, 124.9934, 160.71143, 124.34692, 161.04297, 124.2517);
        ((GeneralPath) shape).lineTo(161.04297, 123.89281);
        ((GeneralPath) shape).lineTo(161.47314, 123.83177);
        ((GeneralPath) shape).curveTo(161.68506, 124.03392, 161.74268, 124.11937, 161.82326, 124.18236);
        ((GeneralPath) shape).lineTo(161.32326, 124.74144);
        ((GeneralPath) shape).lineTo(162.313, 125.39281);
        ((GeneralPath) shape).lineTo(162.0332, 125.81273);
        ((GeneralPath) shape).curveTo(162.21584, 125.91039, 164.19044, 126.885, 164.30322, 127.01244);
        ((GeneralPath) shape).lineTo(164.51318, 127.01244);
        ((GeneralPath) shape).curveTo(164.71094, 127.04662, 164.94875, 127.17894, 165.14307, 127.16137);
        ((GeneralPath) shape).curveTo(166.44531, 127.04516, 167.75342, 126.95532, 169.04297, 126.73266);
        ((GeneralPath) shape).lineTo(170.33301, 127.72241);
        ((GeneralPath) shape).lineTo(171.17188, 127.44262);
        ((GeneralPath) shape).curveTo(172.03906, 127.74877, 172.88818, 128.13792, 173.73193, 128.5017);
        ((GeneralPath) shape).lineTo(174.79298, 126.73266);
        ((GeneralPath) shape).lineTo(175.43312, 128.22241);
        ((GeneralPath) shape).curveTo(177.68556, 127.93823, 179.69875, 127.55005, 181.94191, 127.08179);
        ((GeneralPath) shape).curveTo(181.94191, 127.08179, 184.19435, 129.40308, 184.29298, 129.35278);
        ((GeneralPath) shape).curveTo(184.63234, 129.42651, 186.41164, 130.32204, 186.69191, 130.56274);
        ((GeneralPath) shape).lineTo(186.84328, 130.35278);
        ((GeneralPath) shape).curveTo(186.84328, 130.35278, 187.47267, 130.40942, 187.54298, 130.49146);
        ((GeneralPath) shape).curveTo(187.83694, 130.06714, 188.5723, 129.22536, 188.6719, 128.79175);
        ((GeneralPath) shape).lineTo(190.45316, 130.14282);
        ((GeneralPath) shape).curveTo(191.28175, 130.23022, 192.39651, 130.49731, 193.21194, 130.41138);
        ((GeneralPath) shape).curveTo(193.36917, 130.4475, 193.67435, 130.72192, 193.63235, 130.7727);
        ((GeneralPath) shape).lineTo(194.4932, 131.55151);
        ((GeneralPath) shape).lineTo(195.69193, 131.76245);
        ((GeneralPath) shape).lineTo(197.04298, 130.98267);
        ((GeneralPath) shape).lineTo(197.40237, 130.91138);
        ((GeneralPath) shape).curveTo(197.59232, 131.0393, 197.68362, 131.10767, 197.75198, 131.20142);
        ((GeneralPath) shape).curveTo(197.68118, 131.2727, 198.11234, 131.48267, 198.11234, 131.48267);
        ((GeneralPath) shape).lineTo(198.61234, 131.55151);
        ((GeneralPath) shape).curveTo(198.81985, 131.62573, 198.82864, 131.7981, 198.88235, 131.83179);
        ((GeneralPath) shape).lineTo(198.96194, 132.4724);
        ((GeneralPath) shape).curveTo(199.147, 132.67552, 199.64993, 132.9099, 199.6719, 132.8928);
        ((GeneralPath) shape).curveTo(200.54446, 132.05394, 201.51956, 131.26732, 202.50198, 130.56273);
        ((GeneralPath) shape).curveTo(203.79251, 131.55687, 205.20218, 132.50316, 206.40237, 133.60277);
        ((GeneralPath) shape).lineTo(208.313, 130.98265);
        ((GeneralPath) shape).curveTo(208.4634, 131.00755, 209.13821, 131.41673, 209.18655, 131.48265);
        ((GeneralPath) shape).curveTo(209.78275, 132.29027, 210.88724, 134.59398, 211.50198, 135.66136);
        ((GeneralPath) shape).lineTo(211.57327, 136.02269);
        ((GeneralPath) shape).lineTo(216.8931, 146.5017);
        ((GeneralPath) shape).curveTo(216.2422, 146.56175, 215.2261, 146.52757, 214.68314, 146.92162);
        ((GeneralPath) shape).curveTo(214.68314, 146.92162, 214.4551, 147.52953, 214.41312, 147.63158);
        ((GeneralPath) shape).lineTo(215.54298, 147.5017);
        ((GeneralPath) shape).lineTo(215.75197, 148.56273);
        ((GeneralPath) shape).lineTo(214.12306, 148.7014);
        ((GeneralPath) shape).curveTo(213.72365, 151.65062, 213.44972, 154.70872, 212.9131, 157.63158);
        ((GeneralPath) shape).curveTo(212.68654, 158.86693, 212.1426, 160.23705, 211.78322, 161.4514);
        ((GeneralPath) shape).curveTo(211.33595, 162.9641, 210.09035, 164.22581, 208.74318, 164.99144);
        ((GeneralPath) shape).curveTo(207.7549, 165.55345, 206.61037, 166.12767, 205.97316, 167.12132);
        ((GeneralPath) shape).lineTo(205.34328, 168.0515);
        ((GeneralPath) shape).curveTo(204.91359, 168.39574, 202.31252, 170.54466, 202.28322, 170.60277);
        ((GeneralPath) shape).curveTo(202.07765, 171.0095, 201.90773, 171.45335, 201.72316, 171.87132);
        ((GeneralPath) shape).lineTo(201.0132, 171.73265);
        ((GeneralPath) shape).curveTo(198.73439, 173.49388, 195.69533, 175.65453, 194.07326, 178.04173);
        ((GeneralPath) shape).curveTo(193.9546, 178.05833, 193.32472, 178.60423, 193.21193, 178.68234);
        ((GeneralPath) shape).lineTo(192.72316, 180.02267);
        ((GeneralPath) shape).lineTo(192.44191, 180.23264);
        ((GeneralPath) shape).curveTo(192.48732, 180.47433, 192.75392, 181.70871, 192.72316, 181.8713);
        ((GeneralPath) shape).curveTo(193.20314, 181.91574, 194.91457, 182.00119, 195.27199, 182.15158);
        ((GeneralPath) shape).curveTo(195.60744, 182.03781, 195.92336, 181.29318, 196.19191, 181.08176);
        ((GeneralPath) shape).curveTo(196.88087, 180.54025, 197.78712, 180.07443, 198.53322, 179.60275);
        ((GeneralPath) shape).curveTo(199.82619, 180.82787, 201.1797, 179.00266, 202.0132, 178.2517);
        ((GeneralPath) shape).curveTo(201.95998, 178.63693, 201.56789, 181.89427, 201.44191, 182.0017);
        ((GeneralPath) shape).curveTo(201.45265, 182.20189, 201.58546, 184.43333, 201.57326, 184.48265);
        ((GeneralPath) shape).curveTo(201.31105, 185.54466, 200.42043, 187.00853, 199.95314, 188.03148);
        ((GeneralPath) shape).curveTo(199.81984, 188.32396, 199.9424, 188.5847, 199.88234, 188.88158);
        ((GeneralPath) shape).curveTo(199.84523, 189.06517, 199.44875, 190.22142, 199.45314, 190.3015);
        ((GeneralPath) shape).curveTo(199.51662, 191.46507, 199.94337, 192.89085, 200.1631, 194.0515);
        ((GeneralPath) shape).lineTo(201.22316, 195.0515);
        ((GeneralPath) shape).curveTo(201.0215, 195.33763, 200.67775, 196.08763, 200.73195, 196.46165);
        ((GeneralPath) shape).curveTo(201.87257, 197.23997, 204.46925, 198.52367, 205.83302, 198.66138);
        ((GeneralPath) shape).curveTo(205.81007, 200.57298, 205.86427, 202.49046, 205.90236, 204.4016);
        ((GeneralPath) shape).lineTo(208.03322, 204.82152);
        ((GeneralPath) shape).curveTo(208.0591, 205.6472, 208.01613, 210.49486, 207.82326, 211.07152);
        ((GeneralPath) shape).curveTo(206.84914, 211.50218, 205.54543, 211.67601, 204.49318, 211.7014);
        ((GeneralPath) shape).curveTo(204.67336, 212.03343, 205.84572, 214.21019, 205.7632, 214.3928);
        ((GeneralPath) shape).lineTo(205.7632, 215.03148);
        ((GeneralPath) shape).curveTo(205.73976, 215.15794, 205.32521, 215.42845, 205.19191, 215.4514);
        ((GeneralPath) shape).lineTo(202.64308, 215.8928);
        ((GeneralPath) shape).curveTo(202.95753, 218.04808, 203.3174, 220.1897, 203.70314, 222.33177);
        ((GeneralPath) shape).curveTo(204.21584, 225.17796, 204.90138, 226.02953, 206.53322, 228.43236);
        ((GeneralPath) shape).curveTo(207.63722, 230.05785, 208.8047, 231.62474, 210.0132, 233.17162);
        ((GeneralPath) shape).curveTo(211.98244, 230.9138, 213.96877, 228.66917, 215.97316, 226.44263);
        ((GeneralPath) shape).curveTo(215.92677, 226.33372, 216.11086, 226.25317, 216.18312, 226.23267);
        ((GeneralPath) shape).curveTo(216.48683, 225.12914, 220.33693, 223.78491, 221.28322, 223.68237);
        ((GeneralPath) shape).curveTo(222.16115, 223.58765, 223.09767, 223.61743, 223.97218, 223.75171);
        ((GeneralPath) shape).curveTo(224.6426, 223.85474, 225.29836, 224.40015, 225.8921, 224.74146);
        ((GeneralPath) shape).curveTo(226.48341, 226.97243, 225.2881, 227.02126, 227.37306, 229.06274);
        ((GeneralPath) shape).lineTo(227.58302, 229.56274);
        ((GeneralPath) shape).curveTo(227.38281, 229.7483, 227.1797, 230.38892, 227.23195, 230.62134);
        ((GeneralPath) shape).curveTo(227.23195, 230.62134, 227.51222, 231.00659, 227.58302, 231.12134);
        ((GeneralPath) shape).lineTo(227.87306, 231.2727);
        ((GeneralPath) shape).curveTo(228.05959, 231.31567, 228.34425, 231.31274, 228.44191, 231.40163);
        ((GeneralPath) shape).lineTo(228.65187, 231.54176);
        ((GeneralPath) shape).lineTo(229.36232, 231.04176);
        ((GeneralPath) shape).curveTo(229.49123, 231.20924, 229.74953, 231.32594, 229.85207, 231.48268);
        ((GeneralPath) shape).curveTo(230.23634, 232.07008, 233.5171, 236.93092, 233.69191, 237.42165);
        ((GeneralPath) shape).curveTo(233.95168, 238.15016, 234.01271, 239.13403, 234.18214, 239.90163);
        ((GeneralPath) shape).curveTo(234.62941, 241.928, 235.08937, 244.00903, 235.67236, 246.00172);
        ((GeneralPath) shape).curveTo(236.19238, 247.77661, 237.47266, 250.32593, 238.22754, 252.09302);
        ((GeneralPath) shape).closePath();
        
        // transformieren:
        Shape newShape = transformiere(shape);
        return  newShape;
    }

}
