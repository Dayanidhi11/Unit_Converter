package com.dayanidhi.calculator

class ConvertingUnits {
    internal class Area {
        fun sqMilliToMeter(milli: Double): Double {
            return milli / 1000000
        }

        fun sqMeterToMilli(meter: Double): Double {
            return meter * 1000000
        }

        fun sqCentiToMeter(Centi: Double): Double {
            return Centi / 10000
        }

        fun sqMeterToCenti(meter: Double): Double {
            return meter * 10000
        }

        fun sqKiloToMeter(Kilo: Double): Double {
            return Kilo * 1000000
        }

        fun sqMeterToKilo(meter: Double): Double {
            return meter / 1000000
        }

        fun AcreToMeter(acre: Double): Double {
            return acre * 4046.86
        }

        fun sqMeterToAcre(meter: Double): Double {
            return meter / 4046.86
        }

        fun HectareToMeter(Hectare: Double): Double {
            return Hectare * 10000
        }

        fun sqMeterToHectare(meter: Double): Double {
            return meter / 10000
        }
    }

    //class to convert units of length
    internal class Length {
        fun MilliToMeter(milli: Double): Double {
            return milli / 1000
        }

        fun MeterToMilli(meter: Double): Double {
            return meter * 1000
        }

        fun CentiToMeter(Centi: Double): Double {
            return Centi / 100
        }

        fun MeterToCenti(meter: Double): Double {
            return meter * 100
        }

        fun KiloToMeter(Kilo: Double): Double {
            return Kilo * 1000
        }

        fun MeterToKilo(meter: Double): Double {
            return meter / 1000
        }

        fun InchToMeter(Inch: Double): Double {
            return Inch / 39.3701
        }

        fun MeterToInch(meter: Double): Double {
            return meter * 39.3701
        }

        fun FootToMeter(Foot: Double): Double {
            return Foot / 3.28084
        }

        fun MeterToFoot(meter: Double): Double {
            return meter * 3.28084
        }

        fun YardToMeter(Yard: Double): Double {
            return Yard / 1.09361
        }

        fun MeterToYard(meter: Double): Double {
            return meter * 1.09361
        }

        fun MileToMeter(Mile: Double): Double {
            return Mile / 0.000621371
        }

        fun MeterToMile(meter: Double): Double {
            return meter * 0.000621371
        }

        fun NanoToMeter(milli: Double): Double {
            return milli / 1000000000
        }

        fun MeterToNano(meter: Double): Double {
            return meter * 1000000000
        }
    }

    //class to convert units of temperature
    internal class Temperature {
        fun FerToKelvin(fer: Double): Double {
            return (fer + 459.67) * 5 / 9
        }

        fun KelvinToFer(kelvin: Double): Double {
            return kelvin * 9 / 5 - 459.67
        }

        fun CelsiTokelvin(Celsi: Double): Double {
            return Celsi + 273.15
        }

        fun KelvinToCelsi(Kelvin: Double): Double {
            return Kelvin - 273.15
        }
    }

    //class to convert units of mass/weight
    internal class Weight {
        fun MilliToKilo(milli: Double): Double {
            return milli / 1000000
        }

        fun KiloToMilli(Kilo: Double): Double {
            return Kilo * 1000000
        }

        fun GramToKilo(Gram: Double): Double {
            return Gram / 1000
        }

        fun KiloToGram(Kilo: Double): Double {
            return Kilo * 1000
        }

        fun CentiToKilo(Centi: Double): Double {
            return Centi / 100000
        }

        fun KiloToCenti(Kilo: Double): Double {
            return Kilo * 100000
        }

        fun DeciToKilo(Deci: Double): Double {
            return Deci / 10000
        }

        fun KiloToDeci(Kilo: Double): Double {
            return Kilo * 10000
        }

        fun MetricTonnesToKilo(MetricTonnes: Double): Double {
            return MetricTonnes * 1000
        }

        fun KiloToMetricTonnes(Kilo: Double): Double {
            return Kilo / 1000
        }

        fun PoundsToKilo(Pounds: Double): Double {
            return Pounds / 2.20462
        }

        fun KiloToPounds(Kilo: Double): Double {
            return Kilo * 2.20462
        }

        fun OuncesToKilo(Ounces: Double): Double {
            return Ounces / 35.274
        }

        fun KiloToOunces(Kilo: Double): Double {
            return Kilo * 35.274
        }
    }
}