package com.psilocke.curiouslanterns.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CuriousLanternsClientConfig {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	
	public static final ForgeConfigSpec.ConfigValue<Boolean> LANTERN_SWING;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SNEAK_TRANSLATION;
	
	static {
		BUILDER.push("Client Configs for Curious Lanterns");
		
		LANTERN_SWING = BUILDER.comment("Should the lantern swing or not.\nDefault: true").define("Should Swing", true);
		SNEAK_TRANSLATION = BUILDER.comment("Should sneaking change the lantern's position.\nDefault: true").define("Sneak Translation", true);
		
		BUILDER.pop();
		SPEC = BUILDER.build();
	}
}
