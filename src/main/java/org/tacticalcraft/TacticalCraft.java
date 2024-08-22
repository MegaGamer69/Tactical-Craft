package org.tacticalcraft;

// Importações Úteis
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod(TacticalCraft.MOD_ID)
public class TacticalCraft
{
	// Variaveis Estáticas
	public static final String MOD_ID = "tacticalcraft";
	public static final String MOD_NM = "Tactical Craft";
	
	private static final Logger CONSOLE = LogManager.getLogger();

	// Construtor
	public TacticalCraft()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuffs);
        
		TCItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	// Configura
	private void setup(FMLCommonSetupEvent event)
	{
		CONSOLE.info("Não Esqueça de Seguir nossa Equipe no Twitter(o Atual X) :D");
	}

	// Faz Coisas no Lado do Cliente
	private void doClientStuffs(FMLClientSetupEvent event)
	{
		CONSOLE.info("Não Esqueça de Seguir nossa equipe no Twitter(o Atual X) :D");
	}
}
