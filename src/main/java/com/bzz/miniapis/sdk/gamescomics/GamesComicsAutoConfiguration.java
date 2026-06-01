package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        AmiiboapiProperties.class,
        AnimalCrossingNewHorizonsProperties.class,
        AutochessVngProperties.class,
        BarterVgProperties.class,
        BattleNetProperties.class,
        BoardGameGeekProperties.class,
        BrawlStarsProperties.class,
        BugsnaxProperties.class,
        CheapsharkProperties.class,
        ChessComProperties.class,
        ChuckNorrisDatabaseProperties.class,
        ClashOfClansProperties.class,
        ClashRoyaleProperties.class,
        ComicVineProperties.class,
        CrafatarProperties.class,
        CrossUniverseProperties.class,
        DeckOfCardsProperties.class,
        DestinyTheGameProperties.class,
        DigimonInformationProperties.class,
        DigimonTcgProperties.class,
        DisneyProperties.class,
        Dota2Properties.class,
        DungeonsAndDragonsProperties.class,
        DungeonsAndDragonsAlternateProperties.class,
        EveOnlineProperties.class,
        FfxivCollectProperties.class,
        FifaUltimateTeamProperties.class,
        FinalFantasyXivProperties.class,
        FortniteProperties.class,
        ForzaProperties.class,
        FreetogameProperties.class,
        FunFactsProperties.class,
        FuntranslationsProperties.class,
        GamerpowerProperties.class,
        GdbrowserProperties.class,
        GeekJokesProperties.class,
        GenshinImpactProperties.class,
        GiantBombProperties.class,
        GraphqlPokemonProperties.class,
        GuildWars2Properties.class,
        Gw2SpidyProperties.class,
        HaloProperties.class,
        HearthstoneProperties.class,
        HumbleBundleProperties.class,
        HumorProperties.class,
        HypixelProperties.class,
        HyruleCompendiumProperties.class,
        HytaleProperties.class,
        IgdbComProperties.class,
        JokeapiProperties.class,
        JokesOneProperties.class,
        JserviceProperties.class,
        LichessProperties.class,
        MagicTheGatheringProperties.class,
        MarioKartTourProperties.class,
        MarvelProperties.class,
        MinecraftServerStatusProperties.class,
        MmoGamesProperties.class,
        ModIoProperties.class,
        MojangProperties.class,
        MonsterHunterWorldProperties.class,
        OpenTriviaProperties.class,
        PandascoreProperties.class,
        PathOfExileProperties.class,
        PlayerdbProperties.class,
        PokApiProperties.class,
        PokApiGraphqlProperties.class,
        PokMonTcgProperties.class,
        PsychonautsProperties.class,
        PubgProperties.class,
        PuyoNexusProperties.class,
        QuizapiIoProperties.class,
        RaiderProperties.class,
        RawgIoProperties.class,
        RickAndMortyProperties.class,
        RiotGamesProperties.class,
        Rps101Properties.class,
        RunescapeProperties.class,
        SakuraCardcaptorProperties.class,
        ScryfallProperties.class,
        SpacetradersapiProperties.class,
        SteamProperties.class,
        SteamProperties.class,
        SuperheroesProperties.class,
        TcgdexProperties.class,
        TebexProperties.class,
        TetrIoProperties.class,
        TronaldDumpProperties.class,
        UniversalisProperties.class,
        ValorantNonOfficialProperties.class,
        WarfaceNonOfficialProperties.class,
        WargamingNetProperties.class,
        WhenIsNextMcuFilmProperties.class,
        XkcdProperties.class,
        YuGiOhProperties.class
})
public class GamesComicsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.amiiboapi.enabled", havingValue = "true", matchIfMissing = true)
    public AmiiboapiClient amiiboapiClient(AmiiboapiProperties properties) {
        return createClient(AmiiboapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.animalcrossingnewhorizons.enabled", havingValue = "true", matchIfMissing = true)
    public AnimalCrossingNewHorizonsClient animalcrossingnewhorizonsClient(AnimalCrossingNewHorizonsProperties properties) {
        return createClient(AnimalCrossingNewHorizonsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.autochessvng.enabled", havingValue = "true", matchIfMissing = true)
    public AutochessVngClient autochessvngClient(AutochessVngProperties properties) {
        return createClient(AutochessVngClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.bartervg.enabled", havingValue = "true", matchIfMissing = true)
    public BarterVgClient bartervgClient(BarterVgProperties properties) {
        return createClient(BarterVgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.battlenet.enabled", havingValue = "true", matchIfMissing = true)
    public BattleNetClient battlenetClient(BattleNetProperties properties) {
        return createClient(BattleNetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.boardgamegeek.enabled", havingValue = "true", matchIfMissing = true)
    public BoardGameGeekClient boardgamegeekClient(BoardGameGeekProperties properties) {
        return createClient(BoardGameGeekClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.brawlstars.enabled", havingValue = "true", matchIfMissing = true)
    public BrawlStarsClient brawlstarsClient(BrawlStarsProperties properties) {
        return createClient(BrawlStarsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.bugsnax.enabled", havingValue = "true", matchIfMissing = true)
    public BugsnaxClient bugsnaxClient(BugsnaxProperties properties) {
        return createClient(BugsnaxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.cheapshark.enabled", havingValue = "true", matchIfMissing = true)
    public CheapsharkClient cheapsharkClient(CheapsharkProperties properties) {
        return createClient(CheapsharkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.chesscom.enabled", havingValue = "true", matchIfMissing = true)
    public ChessComClient chesscomClient(ChessComProperties properties) {
        return createClient(ChessComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.chucknorrisdatabase.enabled", havingValue = "true", matchIfMissing = true)
    public ChuckNorrisDatabaseClient chucknorrisdatabaseClient(ChuckNorrisDatabaseProperties properties) {
        return createClient(ChuckNorrisDatabaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.clashofclans.enabled", havingValue = "true", matchIfMissing = true)
    public ClashOfClansClient clashofclansClient(ClashOfClansProperties properties) {
        return createClient(ClashOfClansClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.clashroyale.enabled", havingValue = "true", matchIfMissing = true)
    public ClashRoyaleClient clashroyaleClient(ClashRoyaleProperties properties) {
        return createClient(ClashRoyaleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.comicvine.enabled", havingValue = "true", matchIfMissing = true)
    public ComicVineClient comicvineClient(ComicVineProperties properties) {
        return createClient(ComicVineClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.crafatar.enabled", havingValue = "true", matchIfMissing = true)
    public CrafatarClient crafatarClient(CrafatarProperties properties) {
        return createClient(CrafatarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.crossuniverse.enabled", havingValue = "true", matchIfMissing = true)
    public CrossUniverseClient crossuniverseClient(CrossUniverseProperties properties) {
        return createClient(CrossUniverseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.deckofcards.enabled", havingValue = "true", matchIfMissing = true)
    public DeckOfCardsClient deckofcardsClient(DeckOfCardsProperties properties) {
        return createClient(DeckOfCardsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.destinythegame.enabled", havingValue = "true", matchIfMissing = true)
    public DestinyTheGameClient destinythegameClient(DestinyTheGameProperties properties) {
        return createClient(DestinyTheGameClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.digimoninformation.enabled", havingValue = "true", matchIfMissing = true)
    public DigimonInformationClient digimoninformationClient(DigimonInformationProperties properties) {
        return createClient(DigimonInformationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.digimontcg.enabled", havingValue = "true", matchIfMissing = true)
    public DigimonTcgClient digimontcgClient(DigimonTcgProperties properties) {
        return createClient(DigimonTcgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.disney.enabled", havingValue = "true", matchIfMissing = true)
    public DisneyClient disneyClient(DisneyProperties properties) {
        return createClient(DisneyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.dota2.enabled", havingValue = "true", matchIfMissing = true)
    public Dota2Client dota2Client(Dota2Properties properties) {
        return createClient(Dota2Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.dungeonsanddragons.enabled", havingValue = "true", matchIfMissing = true)
    public DungeonsAndDragonsClient dungeonsanddragonsClient(DungeonsAndDragonsProperties properties) {
        return createClient(DungeonsAndDragonsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.dungeonsanddragonsalternate.enabled", havingValue = "true", matchIfMissing = true)
    public DungeonsAndDragonsAlternateClient dungeonsanddragonsalternateClient(DungeonsAndDragonsAlternateProperties properties) {
        return createClient(DungeonsAndDragonsAlternateClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.eveonline.enabled", havingValue = "true", matchIfMissing = true)
    public EveOnlineClient eveonlineClient(EveOnlineProperties properties) {
        return createClient(EveOnlineClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.ffxivcollect.enabled", havingValue = "true", matchIfMissing = true)
    public FfxivCollectClient ffxivcollectClient(FfxivCollectProperties properties) {
        return createClient(FfxivCollectClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.fifaultimateteam.enabled", havingValue = "true", matchIfMissing = true)
    public FifaUltimateTeamClient fifaultimateteamClient(FifaUltimateTeamProperties properties) {
        return createClient(FifaUltimateTeamClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.finalfantasyxiv.enabled", havingValue = "true", matchIfMissing = true)
    public FinalFantasyXivClient finalfantasyxivClient(FinalFantasyXivProperties properties) {
        return createClient(FinalFantasyXivClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.fortnite.enabled", havingValue = "true", matchIfMissing = true)
    public FortniteClient fortniteClient(FortniteProperties properties) {
        return createClient(FortniteClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.forza.enabled", havingValue = "true", matchIfMissing = true)
    public ForzaClient forzaClient(ForzaProperties properties) {
        return createClient(ForzaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.freetogame.enabled", havingValue = "true", matchIfMissing = true)
    public FreetogameClient freetogameClient(FreetogameProperties properties) {
        return createClient(FreetogameClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.funfacts.enabled", havingValue = "true", matchIfMissing = true)
    public FunFactsClient funfactsClient(FunFactsProperties properties) {
        return createClient(FunFactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.funtranslations.enabled", havingValue = "true", matchIfMissing = true)
    public FuntranslationsClient funtranslationsClient(FuntranslationsProperties properties) {
        return createClient(FuntranslationsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.gamerpower.enabled", havingValue = "true", matchIfMissing = true)
    public GamerpowerClient gamerpowerClient(GamerpowerProperties properties) {
        return createClient(GamerpowerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.gdbrowser.enabled", havingValue = "true", matchIfMissing = true)
    public GdbrowserClient gdbrowserClient(GdbrowserProperties properties) {
        return createClient(GdbrowserClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.geekjokes.enabled", havingValue = "true", matchIfMissing = true)
    public GeekJokesClient geekjokesClient(GeekJokesProperties properties) {
        return createClient(GeekJokesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.genshinimpact.enabled", havingValue = "true", matchIfMissing = true)
    public GenshinImpactClient genshinimpactClient(GenshinImpactProperties properties) {
        return createClient(GenshinImpactClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.giantbomb.enabled", havingValue = "true", matchIfMissing = true)
    public GiantBombClient giantbombClient(GiantBombProperties properties) {
        return createClient(GiantBombClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.graphqlpokemon.enabled", havingValue = "true", matchIfMissing = true)
    public GraphqlPokemonClient graphqlpokemonClient(GraphqlPokemonProperties properties) {
        return createClient(GraphqlPokemonClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.guildwars2.enabled", havingValue = "true", matchIfMissing = true)
    public GuildWars2Client guildwars2Client(GuildWars2Properties properties) {
        return createClient(GuildWars2Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.gw2spidy.enabled", havingValue = "true", matchIfMissing = true)
    public Gw2SpidyClient gw2spidyClient(Gw2SpidyProperties properties) {
        return createClient(Gw2SpidyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.halo.enabled", havingValue = "true", matchIfMissing = true)
    public HaloClient haloClient(HaloProperties properties) {
        return createClient(HaloClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hearthstone.enabled", havingValue = "true", matchIfMissing = true)
    public HearthstoneClient hearthstoneClient(HearthstoneProperties properties) {
        return createClient(HearthstoneClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.humblebundle.enabled", havingValue = "true", matchIfMissing = true)
    public HumbleBundleClient humblebundleClient(HumbleBundleProperties properties) {
        return createClient(HumbleBundleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.humor.enabled", havingValue = "true", matchIfMissing = true)
    public HumorClient humorClient(HumorProperties properties) {
        return createClient(HumorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hypixel.enabled", havingValue = "true", matchIfMissing = true)
    public HypixelClient hypixelClient(HypixelProperties properties) {
        return createClient(HypixelClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hyrulecompendium.enabled", havingValue = "true", matchIfMissing = true)
    public HyruleCompendiumClient hyrulecompendiumClient(HyruleCompendiumProperties properties) {
        return createClient(HyruleCompendiumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hytale.enabled", havingValue = "true", matchIfMissing = true)
    public HytaleClient hytaleClient(HytaleProperties properties) {
        return createClient(HytaleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.igdbcom.enabled", havingValue = "true", matchIfMissing = true)
    public IgdbComClient igdbcomClient(IgdbComProperties properties) {
        return createClient(IgdbComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.jokeapi.enabled", havingValue = "true", matchIfMissing = true)
    public JokeapiClient jokeapiClient(JokeapiProperties properties) {
        return createClient(JokeapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.jokesone.enabled", havingValue = "true", matchIfMissing = true)
    public JokesOneClient jokesoneClient(JokesOneProperties properties) {
        return createClient(JokesOneClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.jservice.enabled", havingValue = "true", matchIfMissing = true)
    public JserviceClient jserviceClient(JserviceProperties properties) {
        return createClient(JserviceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.lichess.enabled", havingValue = "true", matchIfMissing = true)
    public LichessClient lichessClient(LichessProperties properties) {
        return createClient(LichessClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.magicthegathering.enabled", havingValue = "true", matchIfMissing = true)
    public MagicTheGatheringClient magicthegatheringClient(MagicTheGatheringProperties properties) {
        return createClient(MagicTheGatheringClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.mariokarttour.enabled", havingValue = "true", matchIfMissing = true)
    public MarioKartTourClient mariokarttourClient(MarioKartTourProperties properties) {
        return createClient(MarioKartTourClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.marvel.enabled", havingValue = "true", matchIfMissing = true)
    public MarvelClient marvelClient(MarvelProperties properties) {
        return createClient(MarvelClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.minecraftserverstatus.enabled", havingValue = "true", matchIfMissing = true)
    public MinecraftServerStatusClient minecraftserverstatusClient(MinecraftServerStatusProperties properties) {
        return createClient(MinecraftServerStatusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.mmogames.enabled", havingValue = "true", matchIfMissing = true)
    public MmoGamesClient mmogamesClient(MmoGamesProperties properties) {
        return createClient(MmoGamesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.modio.enabled", havingValue = "true", matchIfMissing = true)
    public ModIoClient modioClient(ModIoProperties properties) {
        return createClient(ModIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.mojang.enabled", havingValue = "true", matchIfMissing = true)
    public MojangClient mojangClient(MojangProperties properties) {
        return createClient(MojangClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.monsterhunterworld.enabled", havingValue = "true", matchIfMissing = true)
    public MonsterHunterWorldClient monsterhunterworldClient(MonsterHunterWorldProperties properties) {
        return createClient(MonsterHunterWorldClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.opentrivia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenTriviaClient opentriviaClient(OpenTriviaProperties properties) {
        return createClient(OpenTriviaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pandascore.enabled", havingValue = "true", matchIfMissing = true)
    public PandascoreClient pandascoreClient(PandascoreProperties properties) {
        return createClient(PandascoreClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pathofexile.enabled", havingValue = "true", matchIfMissing = true)
    public PathOfExileClient pathofexileClient(PathOfExileProperties properties) {
        return createClient(PathOfExileClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.playerdb.enabled", havingValue = "true", matchIfMissing = true)
    public PlayerdbClient playerdbClient(PlayerdbProperties properties) {
        return createClient(PlayerdbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pokapi.enabled", havingValue = "true", matchIfMissing = true)
    public PokApiClient pokapiClient(PokApiProperties properties) {
        return createClient(PokApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pokapigraphql.enabled", havingValue = "true", matchIfMissing = true)
    public PokApiGraphqlClient pokapigraphqlClient(PokApiGraphqlProperties properties) {
        return createClient(PokApiGraphqlClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pokmontcg.enabled", havingValue = "true", matchIfMissing = true)
    public PokMonTcgClient pokmontcgClient(PokMonTcgProperties properties) {
        return createClient(PokMonTcgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.psychonauts.enabled", havingValue = "true", matchIfMissing = true)
    public PsychonautsClient psychonautsClient(PsychonautsProperties properties) {
        return createClient(PsychonautsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pubg.enabled", havingValue = "true", matchIfMissing = true)
    public PubgClient pubgClient(PubgProperties properties) {
        return createClient(PubgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.puyonexus.enabled", havingValue = "true", matchIfMissing = true)
    public PuyoNexusClient puyonexusClient(PuyoNexusProperties properties) {
        return createClient(PuyoNexusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.quizapiio.enabled", havingValue = "true", matchIfMissing = true)
    public QuizapiIoClient quizapiioClient(QuizapiIoProperties properties) {
        return createClient(QuizapiIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.raider.enabled", havingValue = "true", matchIfMissing = true)
    public RaiderClient raiderClient(RaiderProperties properties) {
        return createClient(RaiderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.rawgio.enabled", havingValue = "true", matchIfMissing = true)
    public RawgIoClient rawgioClient(RawgIoProperties properties) {
        return createClient(RawgIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.rickandmorty.enabled", havingValue = "true", matchIfMissing = true)
    public RickAndMortyClient rickandmortyClient(RickAndMortyProperties properties) {
        return createClient(RickAndMortyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.riotgames.enabled", havingValue = "true", matchIfMissing = true)
    public RiotGamesClient riotgamesClient(RiotGamesProperties properties) {
        return createClient(RiotGamesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.rps101.enabled", havingValue = "true", matchIfMissing = true)
    public Rps101Client rps101Client(Rps101Properties properties) {
        return createClient(Rps101Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.runescape.enabled", havingValue = "true", matchIfMissing = true)
    public RunescapeClient runescapeClient(RunescapeProperties properties) {
        return createClient(RunescapeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.sakuracardcaptor.enabled", havingValue = "true", matchIfMissing = true)
    public SakuraCardcaptorClient sakuracardcaptorClient(SakuraCardcaptorProperties properties) {
        return createClient(SakuraCardcaptorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.scryfall.enabled", havingValue = "true", matchIfMissing = true)
    public ScryfallClient scryfallClient(ScryfallProperties properties) {
        return createClient(ScryfallClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.spacetradersapi.enabled", havingValue = "true", matchIfMissing = true)
    public SpacetradersapiClient spacetradersapiClient(SpacetradersapiProperties properties) {
        return createClient(SpacetradersapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.steam.enabled", havingValue = "true", matchIfMissing = true)
    public SteamClient steamClient(SteamProperties properties) {
        return createClient(SteamClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.steam2.enabled", havingValue = "true", matchIfMissing = true)
    public SteamClient steam2Client(SteamProperties properties) {
        return createClient(SteamClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.superheroes.enabled", havingValue = "true", matchIfMissing = true)
    public SuperheroesClient superheroesClient(SuperheroesProperties properties) {
        return createClient(SuperheroesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tcgdex.enabled", havingValue = "true", matchIfMissing = true)
    public TcgdexClient tcgdexClient(TcgdexProperties properties) {
        return createClient(TcgdexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tebex.enabled", havingValue = "true", matchIfMissing = true)
    public TebexClient tebexClient(TebexProperties properties) {
        return createClient(TebexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tetrio.enabled", havingValue = "true", matchIfMissing = true)
    public TetrIoClient tetrioClient(TetrIoProperties properties) {
        return createClient(TetrIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tronalddump.enabled", havingValue = "true", matchIfMissing = true)
    public TronaldDumpClient tronalddumpClient(TronaldDumpProperties properties) {
        return createClient(TronaldDumpClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.universalis.enabled", havingValue = "true", matchIfMissing = true)
    public UniversalisClient universalisClient(UniversalisProperties properties) {
        return createClient(UniversalisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.valorantnonofficial.enabled", havingValue = "true", matchIfMissing = true)
    public ValorantNonOfficialClient valorantnonofficialClient(ValorantNonOfficialProperties properties) {
        return createClient(ValorantNonOfficialClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.warfacenonofficial.enabled", havingValue = "true", matchIfMissing = true)
    public WarfaceNonOfficialClient warfacenonofficialClient(WarfaceNonOfficialProperties properties) {
        return createClient(WarfaceNonOfficialClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.wargamingnet.enabled", havingValue = "true", matchIfMissing = true)
    public WargamingNetClient wargamingnetClient(WargamingNetProperties properties) {
        return createClient(WargamingNetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.whenisnextmcufilm.enabled", havingValue = "true", matchIfMissing = true)
    public WhenIsNextMcuFilmClient whenisnextmcufilmClient(WhenIsNextMcuFilmProperties properties) {
        return createClient(WhenIsNextMcuFilmClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.xkcd.enabled", havingValue = "true", matchIfMissing = true)
    public XkcdClient xkcdClient(XkcdProperties properties) {
        return createClient(XkcdClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.yugioh.enabled", havingValue = "true", matchIfMissing = true)
    public YuGiOhClient yugiohClient(YuGiOhProperties properties) {
        return createClient(YuGiOhClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
