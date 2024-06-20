package org.tacticalcraft;

// Importações Úteis
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLClientSetupEvent;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod(TacticalCraft.modID)
public class TacticalCraft
{
	// Variaveis Estáticas
	public static final String modID = new String("tacticalcraft");
	public static final Logger console = LogManager.getLogger();

	// Construtor
	public TacticalCraft()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuffs);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		console.info("Não Esqueça de Seguir nossa Equipe no Twitter(o Atual X) :D");
	}

	private void doClientStuffs(final FMLClientSetupEvent event)
	{
		console.info("Não Esqueça de Seguir nossa equipe no Twitter(o Atual X) :D");
	}
}
