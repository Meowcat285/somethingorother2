package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH120Commute;
import train.common.entity.rollingStock.*;

public enum EnumSounds {

	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, "heavy_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoA4(EntityLocoSteamMallardA4.class, "a4_whistle", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41(EntityLocoSteamC41.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41080(EntityLocoSteamC41_080.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamfowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk765(EntityLocoSteamBerk765.class, "765_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk1225(EntityLocoSteamBerk1225.class, "765_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, "ebt_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100UK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100US(EntityLocoSteamUSATCUS.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "southern_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41T(EntityLocoSteamC41T.class, "drgw_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamShay(EntityLocoSteamShay.class, "lukenhimer_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51S(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51L(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	locoSteamGS4(EntityLocoSteamGS4.class, "daylight_whistle", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, "american_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamvb(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	locoSteamvbShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteam262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamClimax(EntityLocoSteamClimax.class, "crosby_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoElectricVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricTramWood(EntityLocoElectricTramWood.class, "tram_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoElectricSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoElectricE10(EntityLocoElectricE10_DB.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoElectricBR185(EntityLocoElectricBR185.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoElectricClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoElectricE103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoDieselCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40, false),
	locoDieselChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 40, "EMD_16_645E3_Idle", 0.65F, 40, false),
	locoDieselWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false),
	locoDieselSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "EMD_16_710G3B_Notch8", 0.65F, 40, "EMD_16_710G3B_Idle", 0.65F, 40, false),
	locoDieselDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "EMD_16_567D3A_Notch8", 0.65F, 40, "EMD_16_567D3A_Idle", 0.65F, 40, false),
	locoDieselShunter(EntityLocoDieselShunter.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDiesel44tonSwitcher(EntityLocoDiesel44TonSwitcher.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselDeltic(EntityLocoDieselDeltic.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselClass66(EntityLocoDieselClass66.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	DieselHH600(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHH660.class,"leslie_a200", 2.5F, "ALCO_6_531_Notch8", 0.7F, 40, "ALCO_6_531_Notch8", 0.7F, 60, false ),
	DieselAlcoS2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselAlcoS2.class, "leslie_a200", 1F, "ALCO_6_539T_Notch8", 0.50F, 40, "ALCO_6_539T_Idle", 0.65F, 40, true),
	DieselC424(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC424.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselC425(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC425.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselVO1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselVO1000.class,"wabco_e2", 2.5F, "Baldwin_8VO_Notch8", 1F, 8, "Baldwin_8VO_Idle", 1F, 50, false ),
	LocoElectricBP4(EntityLocoElectricBP4.class, "nathan_k5La_3", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	DieselCF7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7.class, "nathan_k3la", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselF7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7A.class, "leslie_a200", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselF7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7B.class, "leslie_a200", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselF40PH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF40PH.class, "nathan_k5la_5", 1F, "EMD_16_645E3_Notch8", 0.9F, 8, "EMD_16_645E3_Notch3", 0.7F, 50, false),
	DieselF45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF45.class,"leslie_s3", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false ),
	DieselFP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP45.class,"leslie_rs5t", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false ),
	DieselGP7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7.class, "nathan_m5", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7b.class, "leslie_a200", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7u(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7u.class, "nathan_k3la_2", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9.class, "nathan_m5", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false),
	DieselGP13(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP13.class, "nathan_p6", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 35, "EMD_16_645E3_Idle", 0.65F, 40, false),
	DieselGP30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP30.class, "nathan_p5", 0.8F, "EMD_16_567D3_Notch8", 0.65F, 35, "EMD_16_567D3_Idle", 0.65F, 40, false),
	DieselMP15DCW9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselMP15DCW9.class,"leslie_rs3j", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false ),
	DieselSD9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, "nathan_k3la", 2.5F, "EMD_16_567C_Notch8", 0.45F, 10, "EMD_16_567C_Idle", 0.75F, 3, true),
	DieselSD40dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2.class, "leslie_rs3k", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true),
	DieselSD40Tdash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40T2.class, "nathan_p3", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true),
	DieselSD45dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, "leslie_rs5t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.65F, 3, true),
	DieselSD70M(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70Mac.class, "nathan_k5la_4", 2F, "EMD_16_710G3B_Notch8", 0.5F, 40, "EMD_16_710G3B_Idle", 0.5F, 20, false),
	DieselSDL39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, "nathan_m3", 2F, "EMD_12_645E3_Notch8", 0.65F, 10, "EMD_12_645E3_Idle", 0.65F, 3, true),
	DieselSDP40F(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40F.class, "leslie_sl4t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, false),
	DieselSW1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1.class, "leslie_a200", 0.9F, "EMD_6_567A_Notch8", 0.45F, 40, "EMD_6_567A_Idle", 0.75F, 40, false),
	DieselSW1500(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1500.class, "nathan_p3", 0.65F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true),
	DieselH1044(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH1044.class, "wabco_e2", 10F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),
	DieselU23B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23B.class, "leslie_s3l", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselSF30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, "leslie_s3", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true),
	GeGenesis(com.jcirmodelsquad.tcjcir.vehicles.locomotives.GeGenesis.class, "nathan_k5La", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselES44(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44.class, "nathan_k5hll", 1F, "GE_GEVO_12_Notch8", 0.65F, 20, "GE_GEVO_12_Idle", 0.75F, 50, true),
	DieselBoxcab23Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, "wabco_e2", 10F, "GE_HBI_600_Notch8", 0.5F, 15, "GE_HBI_600_Idle", 0.5F, 25, false),
	ElectricEF1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEF1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1B.class, " ", 0, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEP1A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEP1A.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	PCH100H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, "nathan_p2", 1F, "pch100h_notch8", 0.6F, 8, "pch100h_idle", 0.4F, 50, false),
	PCH120Commute(PCH120Commute.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	TestControlCar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.TestControlCar.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	ElectricClass345(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricClass345.class, "br_horn", 1F, "mg_run", 0.9F, 8, "mg_idle", 0.7F, 50, false),
	ElectriLUEngine(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricLUengine.class, "lu_whistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamVBShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	TF2_Bombcart(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.BombCart.class, "", 1.5F, "bombcart_run", 1F, 60, "", 0.2F, 20, false),
	locoDieselFOLM1(EntityLocoDieselFOLM1.class, "nathan_p01235", 0.8F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false),
	DieselFOLM1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFOLM1B.class, "", 0.0F,"FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false),
	Dieselgtavthing(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Dieselgtavthing.class,"leslie_s3l", 1F, "EMD_16_567D3_Notch8", 0.9F, 8, "EMD_16_567D3_Idle", 0.7F, 50, false ),
	DieselHustler(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, "wabco3bell", 1F, "Plymouth_V8_Notch8", 0.9F, 8, "Plymouth_V8_Idle", 0.7F, 50, false),
	DieselHighrailTruck(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class, "truck_horn", 0.8F, "GE_HBI_600_Notch8", 0.65F, 15, "GE_HBI_600_Idle", 0.65F, 25, true),
	DieselTGVMobile(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTGVmobile.class, "truck_horn", 1F, "GE_HBI_600_Notch8", 0.9F, 8, "GE_HBI_600_Idle", 0.7F, 50, false),
	DieselHHGregg(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHHgregg.class,"hhgregg600horn", 2.5F, "hhgregg600_run", 1F, 287, "hhgregg600_idle", 1F, 287, false ),
	Thanos(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, "thanos_horn", 5, "thanos_run", 0.65F, 50, "thanos_idle", 0.65F, 50, false),
	;

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
	 *
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

	public Class getEntityClass() {
		return entityClass;
	}

	public String getHornString() {
		return horn;
	}

	public String getRunString() {
		return run;
	}

	public String getIdleString() {
		return idle;
	}

	public Float getHornVolume() {
		return hornVolume;
	}

	public Float getRunVolume() {
		return runVolume;
	}

	public Float getIdleVolume() {
		return idleVolume;
	}

	public int getRunSoundLenght() {
		return runSoundLenght;
	}

	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
